package me.nepnep.nepbot.message.command.commands.admin;

import me.nepnep.nepbot.json.LewdBlackList;
import me.nepnep.nepbot.message.command.ICommand;
import me.nepnep.nepbot.message.command.Category;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.util.List;

public class LewdBlackListCommand implements ICommand {
    @Override
    public void execute(List<String> args, GuildMessageReceivedEvent event) {
        LewdBlackList.add(event.getChannel().getIdLong());
    }
    @Override
    public String getInvoke() {
        return "lewdblacklist";
    }
    @Override
    public Permission requiredPermission() {
        return Permission.MANAGE_CHANNEL;
    }
    @Override
    public Category getCategory() {
        return Category.ADMIN;
    }
    @Override
    public String getDescription() {
        return "Adds the current channel to the lewd blacklist";
    }
}