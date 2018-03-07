/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'Pos'
 * message type.
 */

public class Pos extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 4;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 9;

    /** Create a new Pos of size 4. */
    public Pos() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new Pos of the given data_length. */
    public Pos(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Pos with the given data_length
     * and base offset.
     */
    public Pos(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Pos using the given byte array
     * as backing store.
     */
    public Pos(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Pos using the given byte array
     * as backing store, with the given base offset.
     */
    public Pos(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Pos using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public Pos(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Pos embedded in the given message
     * at the given base offset.
     */
    public Pos(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new Pos embedded in the given message
     * at the given base offset and length.
     */
    public Pos(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <Pos> \n";
      try {
        s += "  [coordinate_x=0x"+Long.toHexString(get_coordinate_x())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [coordinate_y=0x"+Long.toHexString(get_coordinate_y())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: coordinate_x
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'coordinate_x' is signed (false).
     */
    public static boolean isSigned_coordinate_x() {
        return false;
    }

    /**
     * Return whether the field 'coordinate_x' is an array (false).
     */
    public static boolean isArray_coordinate_x() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'coordinate_x'
     */
    public static int offset_coordinate_x() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'coordinate_x'
     */
    public static int offsetBits_coordinate_x() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'coordinate_x'
     */
    public int get_coordinate_x() {
        return (int)getUIntBEElement(offsetBits_coordinate_x(), 16);
    }

    /**
     * Set the value of the field 'coordinate_x'
     */
    public void set_coordinate_x(int value) {
        setUIntBEElement(offsetBits_coordinate_x(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'coordinate_x'
     */
    public static int size_coordinate_x() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'coordinate_x'
     */
    public static int sizeBits_coordinate_x() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: coordinate_y
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'coordinate_y' is signed (false).
     */
    public static boolean isSigned_coordinate_y() {
        return false;
    }

    /**
     * Return whether the field 'coordinate_y' is an array (false).
     */
    public static boolean isArray_coordinate_y() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'coordinate_y'
     */
    public static int offset_coordinate_y() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'coordinate_y'
     */
    public static int offsetBits_coordinate_y() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'coordinate_y'
     */
    public int get_coordinate_y() {
        return (int)getUIntBEElement(offsetBits_coordinate_y(), 16);
    }

    /**
     * Set the value of the field 'coordinate_y'
     */
    public void set_coordinate_y(int value) {
        setUIntBEElement(offsetBits_coordinate_y(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'coordinate_y'
     */
    public static int size_coordinate_y() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'coordinate_y'
     */
    public static int sizeBits_coordinate_y() {
        return 16;
    }

}