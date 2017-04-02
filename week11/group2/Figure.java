package chess;

public class Figure {

    private FigureType figureType;
    
    public Figure(FigureType figureType) {
        this.figureType = figureType;
    }
    
    
    public FigureType getFigureType() {
        return figureType;
    }
    
    @Override
    public String toString() {
        return figureType.name();
    }
    
    
    
}
