package com.news.linglian.action;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io 

.File;
import java.io 

.IOException;
import java.io 

.PrintWriter;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lol
 */
@WebServlet("/token.do")
public class Token extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num = new Random().nextInt(9000) + 1000;
        request.getSession().setAttribute("token", String.valueOf(num));
        ImageIO.write((RenderedImage) getImg(String.valueOf(num)), "png", response.getOutputStream());
    }

    public static Image getImg(String str) {
        BufferedImage bImg = new BufferedImage(100, 40, BufferedImage.TYPE_4BYTE_ABGR_PRE);
        Graphics2D g = (Graphics2D) bImg.getGraphics();
        Random r = new Random();
        int dec = 0;
        for (int i = 0; i < str.length() && i < 4; i++) {
            int tDec = r.nextInt(15) + 10;
            dec += tDec;
            g.translate(tDec, 0); // 向前移动
            int f = r.nextInt(20) - 10;
            g.rotate(f * (2 * Math.PI / 360)); // 旋转
            g.setFont(new Font("黑体", Font.PLAIN, r.nextInt(36) + 18));
            g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
            g.drawString(String.valueOf(str.charAt(i)), 0, 30 + (r.nextInt(10) - 5));
            g.rotate(-f * (2 * Math.PI / 360)); // 撤销旋转
        }
        g.translate(-dec, 0);
        int length = r.nextInt(15) + 15;
        for (int i = 0; i < length; i++) {
            g.setColor(new Color(r.nextInt(125) + 35, r.nextInt(125) + 65, r.nextInt(125) + 72));
            g.drawLine(r.nextInt(150), r.nextInt(70), r.nextInt(150), r.nextInt(70));
        }
        return bImg;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public static void main(String[] args) throws IOException {
        ImageIO.write((RenderedImage) getImg("YHAM"), "jpg", new File("c:\\1.jpg"));
    }
}
