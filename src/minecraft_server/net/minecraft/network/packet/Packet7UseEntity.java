package net.minecraft.network.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Packet7UseEntity extends Packet
{
    /** The entity of the player (ignored by the server) */
    public int playerEntityId;

    /** The entity the player is interacting with */
    public int targetEntity;

    /**
     * Seems to be true when the player is pointing at an entity and left-clicking and false when right-clicking.
     */
    public int isLeftClick;

    /**
     * Abstract. Reads the raw packet data from the data stream.
     */
    public void readPacketData(DataInputStream par1DataInputStream) throws IOException
    {
        this.playerEntityId = par1DataInputStream.readInt();
        this.targetEntity = par1DataInputStream.readInt();
        this.isLeftClick = par1DataInputStream.readByte();
    }

    /**
     * Abstract. Writes the raw packet data to the data stream.
     */
    public void writePacketData(DataOutputStream par1DataOutputStream) throws IOException
    {
        par1DataOutputStream.writeInt(this.playerEntityId);
        par1DataOutputStream.writeInt(this.targetEntity);
        par1DataOutputStream.writeByte(this.isLeftClick);
    }

    /**
     * Passes this Packet on to the NetHandler for processing.
     */
    public void processPacket(NetHandler par1NetHandler)
    {
        par1NetHandler.handleUseEntity(this);
    }

    /**
     * Abstract. Return the size of the packet (not counting the header).
     */
    public int getPacketSize()
    {
        return 9;
    }
}