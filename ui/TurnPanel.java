package ui;

import game.Game;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 public class TurnPanel extends CluedoPanel {
	private static final long serialVersionUID = -8751878244555503503L;
	int i = 0;
	private JPanel parentPlayersPanel;
	private PlayersPanel playersPanel;
	private DeckPanel deckPanel;
	private BoardPanel boardPanel;
	private JPanel containerPanel;
	private JButton rollDiceBut;

     /**
      * Creates new form ApplicationWindow
      */
     public TurnPanel(Controller c) {
    	super(c);
        initComponents();
     }

	 public void resize() {
	 	setPreferredSize(new java.awt.Dimension(getParent().getWidth(), getParent().getHeight()));
	 }

	@Override
	public void nextTurn() {
		boardPanel.nextTurn();
		playersPanel.nextTurn();
		deckPanel.nextTurn();
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	Controller c = controller();
        containerPanel = new JPanel();

        deckPanel = new ui.DeckPanel(c);
        boardPanel = new ui.BoardPanel(c);
        rollDiceBut = new JButton("Roll Dice");
        rollDiceBut.addActionListener(c);

        containerPanel.setLayout(new BorderLayout());
        containerPanel.add(deckPanel, BorderLayout.SOUTH);
        containerPanel.add(boardPanel, BorderLayout.CENTER);
        containerPanel.add(rollDiceBut, BorderLayout.EAST);

        add(containerPanel);
    }

    public BoardPanel getBoardPanel() {
    	return boardPanel;
    }

    public static void main(String[] args) {
		CluedoFrame f = new CluedoFrame();
		Controller c = new Controller(f);
		c.startGame(Game.createDefaultMap());
		TurnPanel toShow = new TurnPanel(c);
		JFrame testFrame = new JFrame();
		testFrame.add(toShow);
		testFrame.pack();
		testFrame.setVisible(true);
	}
}
