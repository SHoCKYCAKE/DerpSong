package io.github.shockycake.derpsong.util;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;

import java.util.ArrayList;
import java.util.List;

public class ResetCommand implements ICommand {
    private boolean booleanSaid;
    private List aliases;

    public ResetCommand() {
        this.aliases = new ArrayList();
        this.aliases.add("setMusicUnplayed");
        this.aliases.add("setUnplay");
    }

    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getCommandName() {
        return "setMusicUnplayed";
    }

    @Override
    public String getCommandUsage(ICommandSender icommandsender) {
        return "setMusicUnplayed <boolean>";
    }

    @Override
    public List getCommandAliases() {
        return this.aliases;
    }

    @Override
    public void processCommand(ICommandSender icommandsender, String[] astring) {
        if (astring.length == 0) {
            return;
        }
        System.out.println(TickHandlerSound.isPlaying);
        String val = astring.toString();
        boolean check = Boolean.parseBoolean(val);
        TickHandlerSound.isPlaying = check;
        System.out.println(TickHandlerSound.isPlaying);
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender icommandsender) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public List addTabCompletionOptions(ICommandSender icommandsender,
                                        String[] astring) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] astring, int i) {
        // TODO Auto-generated method stub
        return false;
    }

}
