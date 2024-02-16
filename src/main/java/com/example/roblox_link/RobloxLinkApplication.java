package com.example.roblox_link;//package com.example.roblox_link;//package com.example.roblox_link;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RobloxLinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(RobloxLinkApplication.class, args);
    }

}
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;
//
//class RobloxLinkApplication extends JFrame {
//    public RobloxLinkApplication() {
//        setTitle("Krug");
//        setSize(400, 400);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g); // Call superclass method to ensure proper rendering
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.fillOval(80, 80, 150, 150);
//        g2d.setPaint(Color.black);
//    }
//
//    public void saveImage(String filename) {
//        BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
//        Graphics2D g2 = image.createGraphics();
//        paint(g2);
//        g2.dispose();
//        try {
//            ImageIO.write(image, "png", new File(filename + ".png"));
//            System.out.println("Image saved as " + filename + ".png");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        RobloxLinkApplication frame = new RobloxLinkApplication();
//        frame.addWindowListener(
//                new WindowAdapter() {
//                    public void windowClosing(WindowEvent e) {
//                        frame.saveImage("krug_image");
//                        System.exit(0);
//                    }
//                }
//        );
//        frame.setVisible(true);
//    }
//}


//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;
//
//public class RobloxLinkApplication {
//    public static void main(String[] args) {
//        String myFile = "krug_image.png";
//        int n = 260, m = 260;
//        int xc = 130, yc = 130;
//        double[][] imArray = new double[n][m];
//        int r = 120;
//
//        for (int x = 0; x < n; x++) {
//            for (int y = 0; y < m; y++) {
//                if (r * r - (x - xc) * (x - xc) - (y - yc) * (y - yc) > 0.1) {
//                    imArray[x][y] = 255.0 / r * Math.sqrt(r * r - (x - xc) * (x - xc) - (y - yc) * (y - yc));
//                }
//            }
//        }
//
//        double maxVal = 0;
//        for (int x = 0; x < n; x++) {
//            for (int y = 0; y < m; y++) {
//                maxVal = Math.max(maxVal, imArray[x][y]);
//            }
//        }
//
//        BufferedImage image = new BufferedImage(n, m, BufferedImage.TYPE_BYTE_GRAY);
//        for (int x = 0; x < n; x++) {
//            for (int y = 0; y < m; y++) {
//                int pixelVal = (int) (imArray[x][y] / maxVal * 255);
//                int rgb = (pixelVal << 16) | (pixelVal << 8) | pixelVal;
//                image.setRGB(x, y, rgb);
//            }
//        }
//
//        File outputfile = new File(myFile);
//        try {
//            ImageIO.write(image, "png", outputfile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.util.*;
//
//public class RobloxLinkApplication {
//
//    public static void main(String[] args) {
//        int width = 800;
//        int height = 600;
//        Integer[] imageCounter = new Integer[480000];
//        Integer[] amountCounter = new Integer[480000];
//
//        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//
//        for (int y = 0; y < height; y++) {
//
//            int counter = 0;
//            for (int x = 0; x < width; x++) {
//                int grayscaleValue = (int) (255.0 * x / width);
////                int pixel = (grayscaleValue << 16) | (grayscaleValue << 8) | grayscaleValue;
//                imageCounter[counter] = grayscaleValue;
//                amountCounter[counter] = counter;
//                counter++;
////                System.out.println(grayscaleValue);
////                image.setRGB(x, y, pixel);
//            }
//        }
//
//        List<Integer> asList = Arrays.asList(imageCounter);
//        Set<Integer> mySet = new HashSet<>(asList);
//        List<Integer> amountList = Arrays.asList(amountCounter);
//        for (int i = 0;i<mySet.size();i++) {
//            System.out.println( " " + Collections.frequency(asList, s));
//            System.out.println(amountList.get(s));
//        }
//
//
//        try {
//            File output = new File("image.jpg");
//            ImageIO.write(image, "jpg", output);
//            System.out.println("Done.");
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}


