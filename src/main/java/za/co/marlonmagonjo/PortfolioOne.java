package za.co.marlonmagonjo;

import java.util.HashMap;

public class PortfolioOne {

    private final HashMap<String, Position> positions;

    public PortfolioOne(){
        positions = new HashMap<>();
    }

    public HashMap<String, Position> getAllPositions(){
        return positions;
    }

    public void add(Position position){
        String symbol = position.getStock().symbol();
        positions.put(symbol, position);
    }

    public Position getPosition(String symbol){
        return positions.get(symbol);
    }
}
