package com.main.tetris;

import com.main.tetris.Shape.Tetrominoes;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class Board extends JPanel {
    private final int BOARD_HEIGHT = 22;
    private final int BOARD_WIDTH = 10;
    private final int PERIOD_INTERVAL = 300;

    private Timer timer;
    private boolean isFallingFinished = false;
    private boolean isPaused = false;
    private int numLinesRemoved = 0;
    private int curX = 0;
    private int curY = 0;
    private JLabel statusbar;
    private Shape curPiece;
    private Tetrominoes[] board;

    public Board(Tetris parent) {
        initBoard(parent);
    }
    private void initBoard(Tetris parent) {
        setFocusable(true);
        statusbar = parent.getStatusBar();
        addKeyListener(new TAdapter());
    }
}
