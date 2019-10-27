package javaimgeditor;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class ImageEditor extends javax.swing.JFrame {
    public ImageEditor() 
    {
        initComponents();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBrowsImage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelImage = new javax.swing.JLabel();
        jButtonBlur1 = new javax.swing.JButton();
        jButtonDarken1 = new javax.swing.JButton();
        jButtonLighten2 = new javax.swing.JButton();
        jButtonInvert3 = new javax.swing.JButton();
        jButtonSave5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonCircleCrop1 = new javax.swing.JButton();
        jButtonRectangleCrop2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonBrowsImage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonBrowsImage.setText("Browse");
        jButtonBrowsImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowsImageActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Editing Tools:");

        jButtonBlur1.setText("Blur");
        jButtonBlur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlur1ActionPerformed(evt);
            }
        });

        jButtonDarken1.setText("Darken");
        jButtonDarken1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDarken1ActionPerformed(evt);
            }
        });

        jButtonLighten2.setText("Lighten");
        jButtonLighten2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLighten2ActionPerformed(evt);
            }
        });

        jButtonInvert3.setText("Invert");
        jButtonInvert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInvert3ActionPerformed(evt);
            }
        });

        jButtonSave5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSave5.setText("Save Image");
        jButtonSave5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Cropping Tools:");

        jButtonCircleCrop1.setText("Circle");
        jButtonCircleCrop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCircleCrop1ActionPerformed(evt);
            }
        });

        jButtonRectangleCrop2.setText("Rectangle");
        jButtonRectangleCrop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRectangleCrop2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSave5)
                    .addComponent(jButtonInvert3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCircleCrop1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRectangleCrop2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBlur1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDarken1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLighten2))
                    .addComponent(jButtonBrowsImage))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButtonBrowsImage)
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBlur1)
                    .addComponent(jButtonDarken1)
                    .addComponent(jButtonLighten2))
                .addGap(18, 18, 18)
                .addComponent(jButtonInvert3)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCircleCrop1)
                    .addComponent(jButtonRectangleCrop2))
                .addGap(58, 58, 58)
                .addComponent(jButtonSave5)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // ********************************    
    BufferedImage bimg;
    BufferedImage circle;
    BufferedImage flippedImg;
    public boolean Circled= false;
    public boolean flipped = false;
    //******************************
    private void jButtonBrowsImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowsImageActionPerformed
        try{
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(this);
        File selected = jfc.getSelectedFile();
        bimg = ImageIO.read(selected);
        bimg.getScaledInstance(jLabelImage.getHeight(),jLabelImage.getWidth(),BufferedImage.SCALE_SMOOTH);
        jLabelImage.setIcon(new ImageIcon(bimg));}
        catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButtonBrowsImageActionPerformed
    
    private void jButtonBlur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlur1ActionPerformed
        if(Circled == true)
        {
            BufferedImage BlurImg = new BufferedImage(circle.getWidth(null),circle.getHeight(null),BufferedImage.TYPE_BYTE_GRAY);
            Graphics g1 = BlurImg.getGraphics();
            g1.drawImage(circle, 400, 200, null);
            float[] kernel = {1/9f, 1/9f, 1/9f,1/9f,1/9f,1/9f,1/9f,1/9f,1/9f};
            BufferedImageOp b = new ConvolveOp(new Kernel(3,3,kernel));
            circle = b.filter(circle, null);
            g1.dispose();
            Graphics2D g2d = (Graphics2D) g1;
            jLabelImage.setIcon(new ImageIcon(circle));
        }
        else if (flipped == true)
        {
            BufferedImage BlurImg = new BufferedImage(flippedImg.getWidth(null),flippedImg.getHeight(null),BufferedImage.TYPE_BYTE_GRAY);
            Graphics g1 = BlurImg.getGraphics();
            g1.drawImage(flippedImg, 400, 200, null);
            float[] kernel = {1/9f, 1/9f, 1/9f,1/9f,1/9f,1/9f,1/9f,1/9f,1/9f};
            BufferedImageOp b = new ConvolveOp(new Kernel(3,3,kernel));
            flippedImg = b.filter(flippedImg, null);
            g1.dispose();
            Graphics2D g2d = (Graphics2D) g1;
            jLabelImage.setIcon(new ImageIcon(flippedImg));
        }  
        else{
            BufferedImage BlurImg = new BufferedImage(bimg.getWidth(null),bimg.getHeight(null),BufferedImage.TYPE_BYTE_GRAY);
            Graphics g1 = BlurImg.getGraphics();
            g1.drawImage(bimg, 400, 200, null);
            float[] kernel = {1/9f, 1/9f, 1/9f,1/9f,1/9f,1/9f,1/9f,1/9f,1/9f};
            BufferedImageOp b = new ConvolveOp(new Kernel(3,3,kernel));
            bimg = b.filter(bimg, null);
            g1.dispose();
            Graphics2D g2d = (Graphics2D) g1;
            jLabelImage.setIcon(new ImageIcon(bimg));
        }
    }//GEN-LAST:event_jButtonBlur1ActionPerformed

    private void jButtonDarken1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDarken1ActionPerformed
        if(Circled == true)
        {
            float scale = .9f;
            RescaleOp rOp = new RescaleOp(.9f,0,null);
            circle = rOp.filter(circle, null);
            jLabelImage.setIcon(new ImageIcon(circle));
        }
        else if(flipped == true)
        {
            float scale = .9f;
            RescaleOp rOp = new RescaleOp(.9f,0,null);
            flippedImg = rOp.filter(flippedImg, null);
            jLabelImage.setIcon(new ImageIcon(flippedImg));
        }
        
        else
        {
            float scale = .9f;
            RescaleOp rOp = new RescaleOp(.9f,0,null);
            bimg = rOp.filter(bimg, null);
            jLabelImage.setIcon(new ImageIcon(bimg));
        }
    }//GEN-LAST:event_jButtonDarken1ActionPerformed
    
    private void jButtonInvert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInvert3ActionPerformed
        int w,h;
        if(Circled == true)
        {
            w= circle.getWidth();
            h= circle.getHeight();
            flippedImg = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
            for(int y=0; y<h; y++)
            {
                for(int x=0; x<w; x++)
                {
                    flippedImg.setRGB(x,(h-1)-y,circle.getRGB(x,y));   
                }
            }
            jLabelImage.setIcon(new ImageIcon(flippedImg));
            flipped = true;
        }
        else
        {
            w = bimg.getWidth();
            h = bimg.getHeight();
            flippedImg = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
            for(int y=0; y<h; y++)
            {
                for(int x=0; x<w; x++)
                {
                    flippedImg.setRGB(x,(h-1)-y,bimg.getRGB(x,y));   
                }
            }
            jLabelImage.setIcon(new ImageIcon(flippedImg));
            flipped = true;
        }    
    }//GEN-LAST:event_jButtonInvert3ActionPerformed
    
    private void jButtonCircleCrop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCircleCrop1ActionPerformed
        int x=120;
        int y=120;
        int r = 110;
        int m=30;
            
        if(flipped == true)
        {
            circle = new BufferedImage(2*r+(2*m),2*r+(2*m),BufferedImage.TYPE_INT_RGB);
            Graphics2D g = circle.createGraphics();
            g.translate(circle.getWidth()/2, circle.getHeight()/2);
            Arc2D area = new Arc2D.Float(0-r,0-r,2*r,2*r,0,-360,Arc2D.OPEN);
            AlphaComposite comp = AlphaComposite.getInstance(AlphaComposite.CLEAR,0.0f);
            g.setComposite(comp);
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
            g.setClip(area);
            g.drawImage(flippedImg.getSubimage(x-r, y-r, x+r, y+r), -r,-r,this);
            jLabelImage.setIcon(new ImageIcon(circle));
            Circled = true;
        }
        else
        {    
            circle = new BufferedImage(2*r+(2*m),2*r+(2*m),BufferedImage.TYPE_INT_RGB);
            Graphics2D g = circle.createGraphics();
            g.translate(circle.getWidth()/2, circle.getHeight()/2);
            Arc2D area = new Arc2D.Float(0-r,0-r,2*r,2*r,0,-360,Arc2D.OPEN);
            AlphaComposite comp = AlphaComposite.getInstance(AlphaComposite.CLEAR,0.0f);
            g.setComposite(comp);
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
            g.setClip(area);
            g.drawImage(bimg.getSubimage(x-r, y-r, x+r, y+r), -r,-r,this);
            jLabelImage.setIcon(new ImageIcon(circle));
            Circled = true;
        }
    }//GEN-LAST:event_jButtonCircleCrop1ActionPerformed

    private void jButtonLighten2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLighten2ActionPerformed
       if(Circled== true)
        {
            float scale = 1.3f;
            RescaleOp rescOp = new RescaleOp(scale,0,null);
            circle = rescOp.filter(circle, null);
            jLabelImage.setIcon(new ImageIcon(circle));
        }
       else if(flipped == true)
        {
            float scale = 1.3f;
            RescaleOp rescOp = new RescaleOp(scale,0,null);
            flippedImg = rescOp.filter(flippedImg, null);
            jLabelImage.setIcon(new ImageIcon(flippedImg));
        }
       else
        {
            float scale = 1.3f;
            RescaleOp rescOp = new RescaleOp(scale,0,null);
            bimg = rescOp.filter(bimg, null);
            jLabelImage.setIcon(new ImageIcon(bimg));
        }
    }//GEN-LAST:event_jButtonLighten2ActionPerformed
    
    private void jButtonRectangleCrop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRectangleCrop2ActionPerformed
        if(flipped == true)
        {  
            flippedImg = flippedImg.getSubimage(200,100,200,100);
            jLabelImage.setIcon(new ImageIcon(flippedImg));
        }
        else if(Circled == true)
        {
            flippedImg = flippedImg.getSubimage(200,100,200,100);
            jLabelImage.setIcon(new ImageIcon(flippedImg));
        }
            
        else
        {   
            bimg = bimg.getSubimage(350,250,300,200);
            jLabelImage.setIcon(new ImageIcon(bimg));
        }
    }//GEN-LAST:event_jButtonRectangleCrop2ActionPerformed

    private void jButtonSave5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave5ActionPerformed
        if(flipped == true)
        {
            JFileChooser sfc = new JFileChooser();
            int returnedValue = sfc.showSaveDialog(this);
            if(returnedValue == JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    ImageIO.write(flippedImg,"jpg",sfc.getSelectedFile());
                } catch(IOException ioe)
                {
                    System.out.println("Failed to save Image"); 
                }
            }
            else{System.out.println("No File Choosen");}    
        }
        else if(Circled == true)
        {
            JFileChooser sfc = new JFileChooser();
            int returnedValue = sfc.showSaveDialog(this);
            if(returnedValue == JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    ImageIO.write(circle,"jpg",sfc.getSelectedFile());
                } catch(IOException ioe)
                {
                    System.out.println("Failed to save Image"); 
                }
            }
            else{System.out.println("No File Choosen");}
        }
        else
        {
            JFileChooser sfc = new JFileChooser();
            int returnedValue = sfc.showSaveDialog(this);
            if(returnedValue == JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    ImageIO.write(bimg,"jpg",sfc.getSelectedFile());
                } catch(IOException ioe)
                {
                    System.out.println("Failed to save Image"); 
                }
            }
            else{System.out.println("No File Choosen");}   
        }     
    }//GEN-LAST:event_jButtonSave5ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBlur1;
    private javax.swing.JButton jButtonBrowsImage;
    private javax.swing.JButton jButtonCircleCrop1;
    private javax.swing.JButton jButtonDarken1;
    private javax.swing.JButton jButtonInvert3;
    private javax.swing.JButton jButtonLighten2;
    private javax.swing.JButton jButtonRectangleCrop2;
    private javax.swing.JButton jButtonSave5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelImage;
    // End of variables declaration//GEN-END:variables
}