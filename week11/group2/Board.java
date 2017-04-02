package chess;

public class Board {

    Figure[][] figures;
    Figure selectedFigure;
    
    
    public Board() {
        init();
    }


    private void init() {
        figures = new Figure[8][8];
        
        figures[4][4] = new Figure(FigureType.R);
        figures[0][1] = new Figure(FigureType.M);
        figures[0][2] = new Figure(FigureType.B);
        figures[0][3] = new Figure(FigureType.K);
        figures[0][4] = new Figure(FigureType.Q);
        figures[0][5] = new Figure(FigureType.B);
        figures[0][6] = new Figure(FigureType.M);
        figures[0][7] = new Figure(FigureType.R);
        
        selectedFigure = figures[4][4];
        
    }
    
    public boolean selectFigure(int x, int y) {
        selectedFigure = figures[y][x];
        return true;
    }
    
    public boolean move(int x, int y) {
        if (figures[x][y] == null) {
            figures[x][y] = selectedFigure;
        }
        
        return true;
    }
    
    public void printBoard() {
        System.out.print(" ");
        
        for (char c = 'a';c <= 'h';c++) {
            System.out.printf("%3s", c);
        }
        
        System.out.println();
        
        if (selectedFigure == null) {
            
            for (int i=figures.length - 1;i>=0;i--) {
                System.out.printf("%-3d", i+1);
                for (int j=0;j<figures[i].length;j++) {
                    if (figures[i][j] == null) {
                        System.out.print(".  ");
                    } else {
                        System.out.printf("%-3s", figures[i][j]);
                    }
                }
                System.out.println();
            }
        } else {
            
            int x = 0;
            int y = 0;
            
            for (int i=0;i<figures.length;i++) {
                for (int j=0;j<figures[i].length;j++) {
                    if (figures[i][j] == selectedFigure) {
                        y = i;
                        x = j;
                    }
                }
            }
            
            //System.out.printf("Current position: %d %d\n", x, y);
            
            
            for (int i=figures.length - 1;i>=0;i--) {
                System.out.printf("%-3d", i+1);
                
                for (int j=0;j<figures[i].length;j++) {
                    if (isPossible(x, y, j, i)) {
                        System.out.print("*  ");
                    } else {
                        
                        if (figures[i][j] != null) {
                            System.out.printf("%-3s", figures[i][j]);
                        } else {
                            System.out.print(".  ");
                        }
                    }
                }
                
                System.out.println();
            }
            
        }
    }
    
    private boolean isPossible(int fx, int fy, int dx, int dy) {
        if (figures[dy][dx] != null) {
            return false;
        }
        
        if (selectedFigure.getFigureType() == FigureType.R) {
            return fx == dx || fy == dy;
        } else if (selectedFigure.getFigureType() == FigureType.B) {
            
        }
        
        return false;
    }
    
    
}
