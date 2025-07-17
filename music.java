import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class music {
    private static Clip currentClip;
    private static int currentIndex = 1;
    private static final int TOTAL_SONGS = 14;
    private static Timer timer;
    private static boolean isPlaying = false;

    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("image/Screenshot_3.png");
        JFrame frame = new JFrame("Beat_Sphere");
        frame.setIconImage(icon.getImage());
        frame.setSize(600, 500);
        frame.setLayout(new GridLayout(5, 1, 5, 0));

        JButton button0 = new JButton();
        ImageIcon i0 = resizeIcon("image/image_2024_08_06T11_41_03_329Z-Photoroom.png", 100, 80);
        button0.setIcon(i0);
        button0.setPreferredSize(new Dimension(100, 100));
        button0.setBackground(new Color(0, 0, 0));

        JButton button1 = new JButton();
        ImageIcon i1 = resizeIcon("image/Satranga-From-ANIMAL-Hindi-2023-20231027131032-500x500.jpg", 50, 50);
        button1.setIcon(i1);
        button1.setPreferredSize(new Dimension(200, 120));
        button1.setText("  Satranga");
        button1.setBackground(new Color(255, 179, 153));
        button1.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button2 = new JButton();
        ImageIcon i2 = resizeIcon("image/Pehle-Bhi-Main-Remix-Hindi-2024-20240320131003-500x500.jpg", 50, 50);
        button2.setIcon(i2);
        button2.setPreferredSize(new Dimension(200, 120));
        button2.setText("  Pehle_Bhi");
        button2.setBackground(new Color(255, 204, 153));
        button2.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button3 = new JButton();
        ImageIcon i3 = resizeIcon("image/artworks-zDvSlZWzy2C2YALY-G1ZSpQ-t500x500.jpg", 50, 50);
        button3.setIcon(i3);
        button3.setPreferredSize(new Dimension(200, 120));
        button3.setBackground(new Color(255, 230, 153));
        button3.setText("  Dekhha_Tenu");
        button3.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button4 = new JButton();
        ImageIcon i4 = resizeIcon("image/Heeriye-feat-Arijit-Singh-Hindi-2023-20230928050405-500x500.jpg", 50,
                50);
        button4.setIcon(i4);
        button4.setPreferredSize(new Dimension(200, 120));
        button4.setBackground(new Color(255, 255, 153));
        button4.setText("  Heeriye");
        button4.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button5 = new JButton();
        ImageIcon i5 = resizeIcon("image/Sajni-From-Laapataa-Ladies-Hindi-2024-20240212151002-500x500.jpg", 50,
                50);
        button5.setIcon(i5);
        button5.setPreferredSize(new Dimension(200, 120));
        button5.setBackground(new Color(230, 255, 153));
        button5.setText("  Sajni_Ree");
        button5.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button6 = new JButton();
        ImageIcon i6 = resizeIcon("image/Sang-Rahiyo-Hindi-2020-20201008073048-500x500.jpg", 50, 50);
        button6.setIcon(i6);
        button6.setPreferredSize(new Dimension(200, 120));
        button6.setBackground(new Color(204, 255, 153));
        button6.setText("  Sang_Rahiyo");
        button6.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button7 = new JButton();
        ImageIcon i7 = resizeIcon("image/artworks-9L7V4njW3zkBVG1l-misuQQ-t500x500.jpg", 50, 50);
        button7.setIcon(i7);
        button7.setBackground(new Color(179, 255, 153));
        button7.setPreferredSize(new Dimension(200, 120));
        button7.setText("  Suniyan_Suniyan");
        button7.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button8 = new JButton();
        ImageIcon i8 = resizeIcon("image/Tauba-Tauba-From-Bad-Newz-Hindi-2024-20240702073742-500x500.jpg", 50,
                50);
        button8.setIcon(i8);
        button8.setBackground(new Color(153, 255, 153));
        button8.setPreferredSize(new Dimension(200, 120));
        button8.setText("  Tauba_Tauba");
        button8.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button9 = new JButton();
        ImageIcon i9 = resizeIcon("image/artworks-xzuOd4Eq8Rvt1xPI-EfhhTA-t500x500.jpg", 50, 50);
        button9.setIcon(i9);
        button9.setBackground(new Color(153, 255, 179));
        button9.setPreferredSize(new Dimension(200, 120));
        button9.setText("  Thara_Paisa_");
        button9.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button10 = new JButton();
        ImageIcon i10 = resizeIcon(
                "image/Tum-Se-From-Teri-Baaton-Mein-Aisa-Uljha-Jiya-Hindi-2024-20240202001003-500x500.jpg",
                50, 50);
        button10.setIcon(i10);
        button10.setBackground(new Color(153, 255, 204));
        button10.setPreferredSize(new Dimension(200, 120));
        button10.setText("  Tum_Se_");
        button10.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button11 = new JButton();
        ImageIcon i11 = resizeIcon("image/artworks-84Bc6QiJOy2Itx9G-MmqzfA-t500x500.jpg", 50, 50);
        button11.setIcon(i11);
        button11.setBackground(new Color(153, 255, 230));
        button11.setPreferredSize(new Dimension(200, 120));
        button11.setText("  Mehabooba");
        button11.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button12 = new JButton();
        ImageIcon i12 = resizeIcon("image/ab67616d0000b273c08202c50371e234d20caf62.jpeg", 50, 50);
        button12.setIcon(i12);
        button12.setBackground(new Color(153, 255, 255));
        button12.setPreferredSize(new Dimension(200, 120));
        button12.setText("  Kesariya");
        button12.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button13 = new JButton();
        ImageIcon i13 = resizeIcon("image/Dil-De-Diya-From-Thank-God-Hindi-2022-20221014181001-500x500.jpg", 50,
                50);
        button13.setIcon(i13);
        button13.setBackground(new Color(153, 230, 255));
        button13.setPreferredSize(new Dimension(200, 120));
        button13.setText(" Dil De Diya Hai");
        button13.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton button14 = new JButton();
        ImageIcon i14 = resizeIcon("image/ankit2.jpeg", 50, 50);
        button14.setIcon(i14);
        button14.setBackground(new Color(153, 204, 255));
        button14.setPreferredSize(new Dimension(200, 120));
        button14.setText("  Soulmate");
        button14.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton nextButton = new JButton();
        ImageIcon next = resizeIcon("image/next (1).png", 80, 80);
        nextButton.setIcon(next);
        nextButton.setPreferredSize(new Dimension(100, 100));
        nextButton.setBackground(new Color(230, 153, 255));
        nextButton.setVerticalTextPosition(SwingConstants.BOTTOM);

        JButton previousButton = new JButton();
        ImageIcon previous = resizeIcon("image/previous8.png", 80, 80);
        previousButton.setIcon(previous);
        previousButton.setPreferredSize(new Dimension(100, 100));
        previousButton.setBackground(new Color(255, 153, 255));
        previousButton.setVerticalTextPosition(SwingConstants.BOTTOM);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 100, 0);
        slider.setBounds(frame.getWidth() / 2 - 300 / 2, 365, 300, 40);
        slider.setPreferredSize(new Dimension(200, 20));
        slider.setMajorTickSpacing(25);

        ImageIcon playIcon = resizeIcon("image/play-button.png", 80, 80);
        ImageIcon pauseIcon = resizeIcon("image/video-pause-button.png", 80, 80);
        JButton playPauseButton = new JButton(playIcon);
        playPauseButton.setPreferredSize(new Dimension(100, 100));
        playPauseButton.setBorder(null);
        playPauseButton.setBackground(new Color(255, 153, 204));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong(
                        "mp3/Thara_Paisa_Thari_Daulat__4K_Official_Video__Jyoti_Nooran___Isha_Malviya,_Jaani___New_Song_2024(48k).mp3");
                System.out.println("SATRANGA");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sliderSong(
                        "Song/ANIMAL_Pehle_Bhi_Main_Full_Video____Ranbir_Kapoor,Tripti_Dimri__Sandeep_V__Vishal_M,Raj_S__Bhushan_K(128k).wav");
                System.out.println("Pehle_Bhi_Main");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);

            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong(
                        "Song/Dekhha_Tenu_-_Lyric_Video__Mr._Mrs._Mahi__Rajkummar,Janhvi_Mohd._Faiz_Jaani(48k).wav");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong(
                        "Song/Heeriye__Official_Video__Jasleen_Royal_ft_Arijit_Singh__Dulquer_Salmaan__Aditya_Sharma__Taani_Tanvir(128k).wav");
                System.out.println(
                        "Heeriye");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong(
                        "Song/Sajni__Song___Arijit_Singh,_Ram_Sampath___Laapataa_Ladies____Aamir_Khan_Productions(48k).wav");
                System.out.println(
                        "Sajni");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong(
                        "Song/Sang_Rahiyo__Official_Video____Jasleen_Royal_ft._Ranveer_Allahbadia___Ujjwal_Kashyap,Neeraj_Rajawat(128k).wav");
                System.out.println("Sang_Rahiyo");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong(
                        "Song/SUNIYAN_SUNIYAN__Official_Video__Juss_x_MixSingh(48k).wav");
                System.out.println(
                        "SUNIYAN_SUNIYAN");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);

            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong(
                        "Song/Tauba_Tauba___Bad_Newz___Vicky_Kaushal___Triptii_Dimri___Karan_Aujla___In_cinemas_19th_July(128k).wav");
                System.out.println("Tauba_Tauba");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong(
                        "Song/Thara_Paisa_Thari_Daulat__4K_Official_Video__Jyoti_Nooran___Isha_Malviya,_Jaani___New_Song_2024(48k).wav");
                System.out.println(
                        "Thara_Paisa_Thari_Daulat");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong(
                        "Song/Tum_Se__Full_Video___Shahid_Kapoor,_Kriti___Sachin-Jigar,_Raghav_Chaitanya,_Varun_Jain,_Indraneel(48k).wav");
                System.out.println("Tum_Se_");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong("Song/128-Mehabooba - KGF Chapter 2 128 Kbps.wav");
                System.out.println("Mehabooba");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong("Song/128-Kesariya - Brahmastra 128 Kbps.wav");
                System.out.println("Kesariya");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });

        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong("Song/128-Dil De Diya Hai - Thank God 128 Kbps.wav");
                System.out.println("Dil De Diya Hai");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sliderSong("Song/_Soulmate(PagalWorld.com.sb).wav");
                System.out.println("Soulmate");
                WaveWindow waveWindow = new WaveWindow();
                waveWindow.setVisible(true);
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentIndex = (currentIndex + 1) % TOTAL_SONGS;
                switch (currentIndex) {
                    case 1 -> sliderSong(
                            "Song/ANIMAL__SATRANGA_Song__Ranbir_Kapoor,Rashmika_Sandeep_V_Arijit,Shreyas_P,Siddharth-Garima__Bhushan_K(128k).wav");
                    case 2 -> sliderSong(
                            "Song/ANIMAL_Pehle_Bhi_Main_Full_Video____Ranbir_Kapoor,Tripti_Dimri__Sandeep_V__Vishal_M,Raj_S__Bhushan_K(128k).wav");
                    case 3 -> sliderSong(
                            "Song/Dekhha_Tenu_-_Lyric_Video__Mr._Mrs._Mahi__Rajkummar,Janhvi_Mohd._Faiz_Jaani(48k).wav");
                    case 4 -> sliderSong(
                            "Song/Heeriye__Official_Video__Jasleen_Royal_ft_Arijit_Singh__Dulquer_Salmaan__Aditya_Sharma__Taani_Tanvir(128k).wav");
                    case 5 -> sliderSong(
                            "Song/Sajni__Song___Arijit_Singh,_Ram_Sampath___Laapataa_Ladies____Aamir_Khan_Productions(48k).wav");
                    case 6 -> sliderSong(
                            "Song/Sang_Rahiyo__Official_Video____Jasleen_Royal_ft._Ranveer_Allahbadia___Ujjwal_Kashyap,Neeraj_Rajawat(128k).wav");
                    case 7 -> sliderSong(
                            "Song/SUNIYAN_SUNIYAN__Official_Video__Juss_x_MixSingh(48k).wav");
                    case 8 -> sliderSong(
                            "Song/Tauba_Tauba___Bad_Newz___Vicky_Kaushal___Triptii_Dimri___Karan_Aujla___In_cinemas_19th_July(128k).wav");
                    case 9 -> sliderSong(
                            "Song/Thara_Paisa_Thari_Daulat__4K_Official_Video__Jyoti_Nooran___Isha_Malviya,_Jaani___New_Song_2024(48k).wav");
                    case 10 -> sliderSong(
                            "Song/Tum_Se__Full_Video___Shahid_Kapoor,_Kriti___Sachin-Jigar,_Raghav_Chaitanya,_Varun_Jain,_Indraneel(48k).wav");
                    case 11 -> sliderSong("Song/128-Mehabooba - KGF Chapter 2 128 Kbps.wav");
                    case 12 -> sliderSong("Song/128-Kesariya - Brahmastra 128 Kbps.wav");
                    case 13 -> sliderSong("Song/128-Dil De Diya Hai - Thank God 128 Kbps.wav");
                    case 14 -> sliderSong("Song/_Soulmate(PagalWorld.com.sb).wav");

                }
                System.out.println("Playing next song: " + getCurrentSongPath());
            }
        });

        previousButton.addActionListener((ActionEvent e) -> {
            currentIndex = (currentIndex + 1) % TOTAL_SONGS;
            switch (currentIndex) {
                case 1 -> sliderSong(
                        "Song/Heeriye__Official_Video__Jasleen_Royal_ft_Arijit_Singh__Dulquer_Salmaan__Aditya_Sharma__Taani_Tanvir(128k).wav");
                case 2 -> sliderSong(
                        "Song/ANIMAL_Pehle_Bhi_Main_Full_Video____Ranbir_Kapoor,Tripti_Dimri__Sandeep_V__Vishal_M,Raj_S__Bhushan_K(128k).wav");
                case 3 -> sliderSong(
                        "Song/Dekhha_Tenu_-_Lyric_Video__Mr._Mrs._Mahi__Rajkummar,Janhvi_Mohd._Faiz_Jaani(48k).wav");
                case 4 -> sliderSong(
                        "Song/Heeriye__Official_Video__Jasleen_Royal_ft_Arijit_Singh__Dulquer_Salmaan__Aditya_Sharma__Taani_Tanvir(128k).wav");
                case 5 -> sliderSong(
                        "Song/ANIMAL__SATRANGA_Song__Ranbir_Kapoor,Rashmika_Sandeep_V_Arijit,Shreyas_P,Siddharth-Garima__Bhushan_K(128k).wav");
                case 6 -> sliderSong(
                        "Song/Sang_Rahiyo__Official_Video____Jasleen_Royal_ft._Ranveer_Allahbadia___Ujjwal_Kashyap,Neeraj_Rajawat(128k).wav");
                case 7 -> sliderSong(
                        "Song/SUNIYAN_SUNIYAN__Official_Video__Juss_x_MixSingh(48k).wav");
                case 8 -> sliderSong(
                        "Song/128-Mehabooba - KGF Chapter 2 128 Kbps.wav");
                case 9 -> sliderSong(
                        "Song/Thara_Paisa_Thari_Daulat__4K_Official_Video__Jyoti_Nooran___Isha_Malviya,_Jaani___New_Song_2024(48k).wav");
                case 10 -> sliderSong(
                        "Song/Tum_Se__Full_Video___Shahid_Kapoor,_Kriti___Sachin-Jigar,_Raghav_Chaitanya,_Varun_Jain,_Indraneel(48k).wav");
                case 11 -> sliderSong("Song/128-Mehabooba - KGF Chapter 2 128 Kbps.wav");
                case 12 -> sliderSong("Song/128-Kesariya - Brahmastra 128 Kbps.wav");
                case 13 -> sliderSong("Song/128-Dil De Diya Hai - Thank God 128 Kbps.wav");
                case 14 -> sliderSong(
                        "Song/Tum_Se__Full_Video___Shahid_Kapoor,_Kriti___Sachin-Jigar,_Raghav_Chaitanya,_Varun_Jain,_Indraneel(48k).wav");
                
            }
            System.out.println("slidering next song: " + getCurrentSongPath());
        });
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (!slider.getValueIsAdjusting() && currentClip != null) {
                    int trackPosition = slider.getValue();
                    long clipPosition = (long) ((trackPosition / 100.0)
                            * currentClip.getMicrosecondLength());
                    currentClip.setMicrosecondPosition(clipPosition);
                }
            }
        });

        playPauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentClip == null) {
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                                new File("Song/_Soulmate(PagalWorld.com.sb).wav"));
                        currentClip = AudioSystem.getClip();
                        currentClip.open(audioInputStream);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if (isPlaying) {
                    playPauseButton.setIcon(playIcon);
                    currentClip.stop();
                    if (timer != null) {
                        timer.stop();
                    }
                } else {
                    playPauseButton.setIcon(pauseIcon);
                    currentClip.start();
                    if (timer == null) {
                        timer = new Timer(1000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                int value = (int) ((double) currentClip
                                        .getMicrosecondPosition()
                                        / currentClip.getMicrosecondLength()
                                        * 100);
                                if (value < slider.getMaximum()) {
                                    slider.setValue(value);
                                } else {
                                    timer.stop();
                                }
                            }
                        });
                    }
                    timer.start();
                }
                isPlaying = !isPlaying;
            }
        });
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        topPanel.add(button0);
        topPanel.setBackground(new Color(64, 64, 64));

        JPanel firstRowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        firstRowPanel.add(button1);
        firstRowPanel.add(button2);
        firstRowPanel.add(button3);
        firstRowPanel.add(button4);
        firstRowPanel.add(button5);

        JPanel secondRowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        secondRowPanel.add(button6);
        secondRowPanel.add(button7);
        secondRowPanel.add(button8);
        secondRowPanel.add(button9);
        secondRowPanel.add(button10);

        JPanel thirdRowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        thirdRowPanel.add(button11);
        thirdRowPanel.add(button12);
        thirdRowPanel.add(button13);
        thirdRowPanel.add(button14);

        JPanel controlsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        controlsPanel.add(previousButton);
        controlsPanel.add(playPauseButton);
        controlsPanel.add(slider);
        controlsPanel.add(nextButton);

        frame.add(topPanel);
        frame.add(firstRowPanel);
        frame.add(secondRowPanel);
        frame.add(thirdRowPanel);
        frame.add(controlsPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void sliderSong(String filePath) {
        try {
            // use the logical and opretor in this condition
            if (currentClip != null && currentClip.isRunning()) {
                currentClip.stop();
                currentClip.close();
            }

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));
            currentClip = AudioSystem.getClip();
            currentClip.open(audioInputStream);
            currentClip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static String getCurrentSongPath() {
        return switch (currentIndex) {
            case 1 ->
                "Song/ANIMAL__SATRANGA_Song__Ranbir_Kapoor,Rashmika_Sandeep_V_Arijit,Shreyas_P,Siddharth-Garima__Bhushan_K(128k).wav";
            case 2 ->
                "Song/ANIMAL_Pehle_Bhi_Main_Full_Video____Ranbir_Kapoor,Tripti_Dimri__Sandeep_V__Vishal_M,Raj_S__Bhushan_K(128k).wav";
            case 3 ->
                "Song/Dekhha_Tenu_-_Lyric_Video__Mr._Mrs._Mahi__Rajkummar,Janhvi_Mohd._Faiz_Jaani(48k).wav";
            case 4 ->
                "Heeriye__Official_Video__Jasleen_Royal_ft_Arijit_Singh__Dulquer_Salmaan__Aditya_Sharma__Taani_Tanvir(128k).wav";
            case 5 ->
                "Song/Sajni__Song___Arijit_Singh,_Ram_Sampath___Laapataa_Ladies____Aamir_Khan_Productions(48k).wav";
            case 6 ->
                "Song/Sang_Rahiyo__Official_Video____Jasleen_Royal_ft._Ranveer_Allahbadia___Ujjwal_Kashyap,Neeraj_Rajawat(128k).wav";
            case 7 -> "Song/SUNIYAN_SUNIYAN__Official_Video__Juss_x_MixSingh(48k).wav";
            case 8 ->
                "Song/Tauba_Tauba___Bad_Newz___Vicky_Kaushal___Triptii_Dimri___Karan_Aujla___In_cinemas_19th_July(128k).wav";
            case 9 ->
                "Song/Thara_Paisa_Thari_Daulat__4K_Official_Video__Jyoti_Nooran___Isha_Malviya,_Jaani___New_Song_2024(48k).wav";
            case 10 ->
                "Song/Tum_Se__Full_Video___Shahid_Kapoor,_Kriti___Sachin-Jigar,_Raghav_Chaitanya,_Varun_Jain,_Indraneel(48k).wav";
            case 11 -> "Song/128-Mehabooba - KGF Chapter 2 128 Kbps.wav";
            case 12 -> "Song/128-Kesariya - Brahmastra 128 Kbps.wav";
            case 13 -> "Song/128-Dil De Diya Hai - Thank God 128 Kbps.wav";
            case 14 -> "Song/_Soulmate(PagalWorld.com.sb).wav";
            default -> "";
        };
    }

    private static ImageIcon resizeIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}
