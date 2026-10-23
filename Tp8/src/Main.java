
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        // Karakter awal
        Character hero1 = new Character(
            "Arthur", CharacterType.WARRIOR
        );

        Character hero2 = new Character(
            "Merlin", CharacterType.MAGE, 2, 120, 60
        );

        Character hero3 = new Character(
            "Robin", CharacterType.ARCHER
        );

        Character hero4 = new Character(
            "Necro", CharacterType.ASSASSIN
        );
        hero4.setMana(50);

        // Karakter baru untuk TP8
        Character hero5 = new Character(
            "Luna", CharacterType.MAGE, 9, 150, 40
        );

        Character hero6 = new Character(
            "Boris", CharacterType.WARRIOR, 4, 180, 35
        );

        // Memasukkan semua karakter ke CharacterManager
        manager.addCharacter(hero1);
        manager.addCharacter(hero2);
        manager.addCharacter(hero3);
        manager.addCharacter(hero4);
        manager.addCharacter(hero5);
        manager.addCharacter(hero6);

        // Menjalankan GUI pada Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(manager);
            window.setVisible(true);
        });
    }
}
