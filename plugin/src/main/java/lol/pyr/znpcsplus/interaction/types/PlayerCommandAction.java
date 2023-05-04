package lol.pyr.znpcsplus.interaction.types;

import lol.pyr.znpcsplus.ZNPCsPlus;
import lol.pyr.znpcsplus.interaction.NPCAction;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PlayerCommandAction extends NPCAction {
    public PlayerCommandAction(long delay, String argument) {
        super(delay, argument);
    }

    @Override
    public void run(Player player) {
        String cmd = argument.replace("{player}", player.getName()).replace("{uuid}", player.getUniqueId().toString());
        Bukkit.dispatchCommand(player, ZNPCsPlus.PLACEHOLDERS_SUPPORTED ? PlaceholderAPI.setPlaceholders(player, cmd) : cmd);
    }
}
