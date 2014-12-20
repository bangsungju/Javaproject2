
import java.io.*;

import java.util.ArrayList;

import java.awt.*;

import java.awt.event.*;

import java.awt.image.BufferedImage;

import java.awt.datatransfer.*;

import java.awt.dnd.*;



import javax.swing.*;





public class Board extends JPanel {

int tokenCount=6;
int totalCount=25;
String tokenImage= RedTokenImage;//default
String tokenName = "default";

ArrayList<DTPicture> images = new ArrayList<DTPicture>();
ArrayList<DTPicture> additionalImages = new ArrayList<DTPicture>();

    static String RedTokenImage = "TokenRed.png";
    static String GreenTokenImage = "TokenGreen.png";
    static String BlueTokenImage = "TokenBlue.png";
    static String BlackTokenImage = "TokenBlack.png";
    static String YellowTokenImage = "TokenYellow.png";
    static String PurpleTokenImage = "TokenPurple.png";

    

    PictureTransferHandler picHandler;

    public Board() {
        super(new BorderLayout());
        picHandler = new PictureTransferHandler();
        JPanel mugshots = new JPanel(new GridLayout(5, 5));
        for(int i=0;i<tokenCount;i++){
        images.add(new DTPicture(createImageIcon(tokenImage,tokenName).getImage()));
        images.get(i).setTransferHandler(picHandler);
        mugshots.add(images.get(i));
        }
       //����� �� ĭ�� �����ϴ� grid layout

        for(int i=6;i<totalCount;i++){
        images.add(new DTPicture(null));
        images.get(i).setTransferHandler(picHandler);
        mugshots.add(images.get(i));
        }



        setPreferredSize(new Dimension(500, 600));
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        

        int addtionaltokenCount=3;
        int addtionaltotalCount=5;
        JPanel addtionalPanel = new JPanel(new GridLayout(1,5));
        for(int i=0;i<addtionaltokenCount;i++){
        additionalImages.add(new DTPicture(createImageIcon(tokenImage,tokenName).getImage()));
        additionalImages.get(i).setTransferHandler(picHandler);
        addtionalPanel.add(additionalImages.get(i));
        }

        //����� �� ĭ�� �����ϴ� grid layout

        for(int i=addtionaltotalCount-addtionaltokenCount;i<addtionaltotalCount;i++){

        additionalImages.add(new DTPicture(null));

        additionalImages.get(i).setTransferHandler(picHandler);

        addtionalPanel.add(additionalImages.get(i));

        }

        

       //�߰��ؾ��ϴ� ���̾ƿ�.

//       JPanel addpicture = new JPanel(new BorderLayout());

//       addpic1 = new DTPicture(createImageIcon("Maya.jpg",mayaString).getImage());

//       addpic1.setTransferHandler(picHandler);

//       addpicture.add(addpic1);

//       

//       addpic2 = new DTPicture(null);

//       addpic2.setTransferHandler(picHandler);

//       addpicture.add(addpic2);

       

    

//        JPanel topView = new JPanel(new BorderLayout());

//        JLabel title = new JLabel("addtional");

//        topView.add(title,BorderLayout.NORTH);



JPanel infoView = new JPanel(new FlowLayout());

JButton clear = new JButton("Clear"); 

  infoView.add(clear);

  JButton init = new JButton("init"); 

  infoView.add(init);

  JButton solution = new JButton("solution");

  infoView.add(solution);



  add(addtionalPanel,BorderLayout.CENTER);

  add(mugshots, BorderLayout.CENTER);

  add(infoView,BorderLayout.SOUTH);

    }

    protected static ImageIcon createImageIcon(String path,

                                               String description) {

        java.net.URL imageURL = Board.class.getResource(path);

        if (imageURL == null) {

            System.err.println("Resource not found: "

                               + path);

            return null;

        } else {

            return new ImageIcon(imageURL, description);

        }

    }



    private static void createAndShowGUI() {

        JFrame frame = new JFrame("LaserMaze");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Board demo = new Board();

        demo.setOpaque(true); 

        frame.setContentPane(demo);



        //Display the window.

        frame.pack();

        frame.setVisible(true);

    }


    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                createAndShowGUI();

            }

        });

    }

}