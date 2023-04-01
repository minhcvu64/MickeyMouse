/**
 * Author: Minh Chau Vu
 * Date: 08/08/2021
 * Class: CSCI142 4212
 * Instructor: Prof. Syeda Nizami
 * College: Highline College, WA, USA
 * Description: This MickeyMouse class is my attempt to join the Art Contest.
 *              The final picture can be found at: https://drive.google.com/file/d/1OKbT_t45k953xCahpkFCX7WZotx-YIXK/view?usp=sharing
 */

import java.awt.Color;
import java.awt.Graphics;

public class MickeyMouse {
    public static void main(String[] args) {
        final int X_PADDING = 20;
        final int Y_PADDING = 20;
        final int WIDTH = 685;
        final int HEIGHT = 715;
        final int EAR_WIDTH = 250;
        final int EAR_HEIGHT = 250;
        final int FACE_WIDTH = 425;
        final int FACE_HEIGHT = 445;
        final int UPPER_SKIN_WIDTH = 200;
        final int UPPER_SKIN_HEIGHT = 275;
        final int NOSE_WIDTH = 150;
        final int NOSE_HEIGHT = 100;
        final int EYE_WIDTH = 60;
        final int EYE_HEIGHT = 140;
        final int PUPIL_WIDTH = 30;
        final int PUPIL_HEIGHT = 60;
        final int UPPER_LIP_WIDTH = 280;
        final int UPPER_LIP_HEIGHT = 220;
        final int HALF_MOUTH_WIDTH = 180;
        final int MOUTH_HEIGHT = 250;
        final Color SKIN_COLOR = new Color(255, 227, 191);

        DrawingPanel drawingPanel = new DrawingPanel(WIDTH, HEIGHT);
        Graphics graphics = drawingPanel.getGraphics();

        // draw 2 ears and the face background
        graphics.setColor(Color.BLACK);
        graphics.fillOval(X_PADDING, Y_PADDING, EAR_WIDTH, EAR_HEIGHT);
        graphics.fillOval(X_PADDING + 390, Y_PADDING, EAR_WIDTH, EAR_HEIGHT);
        graphics.fillOval(X_PADDING + 110, Y_PADDING + 175, FACE_WIDTH, FACE_HEIGHT);

        // draw upper skin
        graphics.setColor(SKIN_COLOR);
        graphics.fillOval(X_PADDING + 170, Y_PADDING + 190, UPPER_SKIN_WIDTH, UPPER_SKIN_HEIGHT);
        graphics.fillOval(X_PADDING + 270, Y_PADDING + 190, UPPER_SKIN_WIDTH, UPPER_SKIN_HEIGHT);

        // draw the cheeks
        graphics.setColor(SKIN_COLOR);
        graphics.fillArc(X_PADDING + 105, Y_PADDING + 375, 425, 260, 90, 190);
        graphics.fillArc(X_PADDING + 110, Y_PADDING + 375, 425, 260, 90, -190);
        graphics.fillRect(X_PADDING + 245, Y_PADDING + 410, NOSE_WIDTH, NOSE_HEIGHT * 2);

        // draw the left eye
        graphics.setColor(Color.BLACK);
        graphics.fillOval(X_PADDING + 250, Y_PADDING + 265, EYE_WIDTH, EYE_HEIGHT);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(X_PADDING + 250 + 5, Y_PADDING + 265 + 5, EYE_WIDTH - 10, EYE_HEIGHT - 10);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(X_PADDING + 250 + 23, Y_PADDING + 265 + 70, PUPIL_WIDTH, PUPIL_HEIGHT);

        // draw the right eye
        graphics.setColor(Color.BLACK);
        graphics.fillOval(X_PADDING + 325, Y_PADDING + 265, EYE_WIDTH, EYE_HEIGHT);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(X_PADDING + 325 + 5, Y_PADDING + 265 + 5, EYE_WIDTH - 10, EYE_HEIGHT - 10);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(X_PADDING + 325 + 7, Y_PADDING + 265 + 70, PUPIL_WIDTH, PUPIL_HEIGHT);

        // draw the chin
        graphics.setColor(Color.BLACK);
        graphics.fillArc(X_PADDING + 225 - 20, Y_PADDING + 425, HALF_MOUTH_WIDTH + 40, MOUTH_HEIGHT, 200, 70);
        graphics.fillArc(X_PADDING + 225 - 20, Y_PADDING + 425, HALF_MOUTH_WIDTH + 40, MOUTH_HEIGHT, -20, -70);
        graphics.setColor(SKIN_COLOR);
        graphics.fillArc(X_PADDING + 225 - 20, Y_PADDING + 425 - 5, HALF_MOUTH_WIDTH + 40, MOUTH_HEIGHT, 200, 70);
        graphics.fillArc(X_PADDING + 225 - 20, Y_PADDING + 425 - 5, HALF_MOUTH_WIDTH + 40, MOUTH_HEIGHT, -20, -70);

        // draw the mouth
        graphics.setColor(Color.BLACK);
        graphics.fillArc(X_PADDING + 225, Y_PADDING + 400, HALF_MOUTH_WIDTH, MOUTH_HEIGHT, 150, 120);
        graphics.fillArc(X_PADDING + 225, Y_PADDING + 400, HALF_MOUTH_WIDTH, MOUTH_HEIGHT, 30, -120);

        // draw the upper lip
        graphics.setColor(Color.BLACK);
        graphics.fillArc(X_PADDING + 175, Y_PADDING + 360, UPPER_LIP_WIDTH, UPPER_LIP_HEIGHT, 180, 180);
        graphics.setColor(SKIN_COLOR);
        graphics.fillArc(X_PADDING + 175 + 4, Y_PADDING + 360 - 8, UPPER_LIP_WIDTH - 8, UPPER_LIP_HEIGHT, 180, 180);
        graphics.setColor(Color.BLACK);
        graphics.drawArc(X_PADDING + 166, Y_PADDING + 468, 40, 40, 60, 135);
        graphics.drawArc(X_PADDING + 425, Y_PADDING + 468, 40, 40, 120, -135);

        // draw the tongue
        graphics.setColor(Color.RED);
        graphics.fillArc(X_PADDING + 257, Y_PADDING + 598, HALF_MOUTH_WIDTH - 120, 30, 0, 180);
        graphics.fillArc(X_PADDING + 314, Y_PADDING + 598, HALF_MOUTH_WIDTH - 120, 30, 0, 180);
        graphics.fillArc(X_PADDING + 255, Y_PADDING + 560, HALF_MOUTH_WIDTH - 60, 85, -10, -160);
        graphics.setColor(Color.BLACK);
        graphics.drawArc( X_PADDING + 238, Y_PADDING + 600, 100, 65, 0, 60);

        // draw the nose
        graphics.setColor(Color.BLACK);
        graphics.fillArc(X_PADDING + 245, Y_PADDING + 390, NOSE_WIDTH, 50, 0, 180);
        graphics.setColor(SKIN_COLOR);
        graphics.fillArc(X_PADDING + 245, Y_PADDING + 395, NOSE_WIDTH, 50, 0, 180);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(X_PADDING + 245, Y_PADDING + 410, NOSE_WIDTH, NOSE_HEIGHT);
    }
}
