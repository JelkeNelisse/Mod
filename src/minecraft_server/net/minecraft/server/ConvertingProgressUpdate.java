package net.minecraft.server;

import net.minecraft.util.IProgressUpdate;

public class ConvertingProgressUpdate implements IProgressUpdate
{
    private long field_92019_b;

    final MinecraftServer field_92020_a;

    public ConvertingProgressUpdate(MinecraftServer par1MinecraftServer)
    {
        this.field_92020_a = par1MinecraftServer;
        this.field_92019_b = System.currentTimeMillis();
    }

    /**
     * "Saving level", or the loading,or downloading equivelent
     */
    public void displayProgressMessage(String par1Str) {}

    /**
     * Updates the progress bar on the loading screen to the specified amount. Args: loadProgress
     */
    public void setLoadingProgress(int par1)
    {
        if (System.currentTimeMillis() - this.field_92019_b >= 1000L)
        {
            this.field_92019_b = System.currentTimeMillis();
            MinecraftServer.logger.info("Converting... " + par1 + "%");
        }
    }

    /**
     * This is called with "Working..." by resetProgressAndMessage
     */
    public void resetProgresAndWorkingMessage(String par1Str) {}
}
