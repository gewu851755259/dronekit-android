/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GIMBAL_TORQUE_CMD_REPORT PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* 100 Hz gimbal torque command telemetry
*/
public class msg_gimbal_torque_cmd_report extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_GIMBAL_TORQUE_CMD_REPORT = 214;
    public static final int MAVLINK_MSG_LENGTH = 8;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GIMBAL_TORQUE_CMD_REPORT;


      
    /**
    * Roll Torque Command
    */
    public short rl_torque_cmd;
      
    /**
    * Elevation Torque Command
    */
    public short el_torque_cmd;
      
    /**
    * Azimuth Torque Command
    */
    public short az_torque_cmd;
      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Component ID
    */
    public short target_component;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GIMBAL_TORQUE_CMD_REPORT;
              
        packet.payload.putShort(rl_torque_cmd);
              
        packet.payload.putShort(el_torque_cmd);
              
        packet.payload.putShort(az_torque_cmd);
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(target_component);
        
        return packet;
    }

    /**
    * Decode a gimbal_torque_cmd_report message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.rl_torque_cmd = payload.getShort();
              
        this.el_torque_cmd = payload.getShort();
              
        this.az_torque_cmd = payload.getShort();
              
        this.target_system = payload.getUnsignedByte();
              
        this.target_component = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_gimbal_torque_cmd_report(){
        msgid = MAVLINK_MSG_ID_GIMBAL_TORQUE_CMD_REPORT;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_gimbal_torque_cmd_report(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_GIMBAL_TORQUE_CMD_REPORT;
        unpack(mavLinkPacket.payload);        
    }

              
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_GIMBAL_TORQUE_CMD_REPORT - sysid:"+sysid+" compid:"+compid+" rl_torque_cmd:"+rl_torque_cmd+" el_torque_cmd:"+el_torque_cmd+" az_torque_cmd:"+az_torque_cmd+" target_system:"+target_system+" target_component:"+target_component+"";
    }
}
        