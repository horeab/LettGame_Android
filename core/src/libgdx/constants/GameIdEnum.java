package libgdx.constants;

import libgdx.game.GameId;
import libgdx.game.SubGameDependencyManager;
import libgdx.implementations.letter.LettersGameDependencyManager;

public enum GameIdEnum implements GameId {

    lettersgame(LettersGameDependencyManager.class),;

    private Class<? extends SubGameDependencyManager> dependencyManagerClass;

    GameIdEnum(Class<? extends LettersGameDependencyManager> dependencyManagerClass) {
        this.dependencyManagerClass = dependencyManagerClass;
    }

    @Override
    public SubGameDependencyManager getDependencyManager() {
        try {
            return dependencyManagerClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
