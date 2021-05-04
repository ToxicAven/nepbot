package me.nepnep.nepbot.message.command.commands.animals;

import me.nepnep.nepbot.message.command.ICommand;
import me.nepnep.nepbot.message.command.Category;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.util.List;

public class TinySnail implements ICommand {
    @Override
    public void execute(List<String> args, GuildMessageReceivedEvent event) {
        event.getChannel().sendMessage("https://tinysnail.monster/").queue();
    }
    @Override
    public String getInvoke() {
        return "tinysnail";
    }
    @Override
    public Permission requiredPermission() {
        return null;
    }
    @Override
    public Category getCategory() {
        return Category.ANIMALS;
    }
    @Override
    public String getDescription() {
        return "A tiny snail";
    }
}