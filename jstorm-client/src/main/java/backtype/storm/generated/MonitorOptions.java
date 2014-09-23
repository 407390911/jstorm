/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonitorOptions implements org.apache.thrift7.TBase<MonitorOptions, MonitorOptions._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("MonitorOptions");

  private static final org.apache.thrift7.protocol.TField IS_ENABLE_FIELD_DESC = new org.apache.thrift7.protocol.TField("isEnable", org.apache.thrift7.protocol.TType.BOOL, (short)1);

  private boolean isEnable; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    IS_ENABLE((short)1, "isEnable");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // IS_ENABLE
          return IS_ENABLE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISENABLE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_ENABLE, new org.apache.thrift7.meta_data.FieldMetaData("isEnable", org.apache.thrift7.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(MonitorOptions.class, metaDataMap);
  }

  public MonitorOptions() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MonitorOptions(MonitorOptions other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.isEnable = other.isEnable;
  }

  public MonitorOptions deepCopy() {
    return new MonitorOptions(this);
  }

  @Override
  public void clear() {
    set_isEnable_isSet(false);
    this.isEnable = false;
  }

  public boolean is_isEnable() {
    return this.isEnable;
  }

  public void set_isEnable(boolean isEnable) {
    this.isEnable = isEnable;
    set_isEnable_isSet(true);
  }

  public void unset_isEnable() {
    __isset_bit_vector.clear(__ISENABLE_ISSET_ID);
  }

  /** Returns true if field isEnable is set (has been assigned a value) and false otherwise */
  public boolean is_set_isEnable() {
    return __isset_bit_vector.get(__ISENABLE_ISSET_ID);
  }

  public void set_isEnable_isSet(boolean value) {
    __isset_bit_vector.set(__ISENABLE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_ENABLE:
      if (value == null) {
        unset_isEnable();
      } else {
        set_isEnable((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_ENABLE:
      return Boolean.valueOf(is_isEnable());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_ENABLE:
      return is_set_isEnable();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MonitorOptions)
      return this.equals((MonitorOptions)that);
    return false;
  }

  public boolean equals(MonitorOptions that) {
    if (that == null)
      return false;

    boolean this_present_isEnable = true && this.is_set_isEnable();
    boolean that_present_isEnable = true && that.is_set_isEnable();
    if (this_present_isEnable || that_present_isEnable) {
      if (!(this_present_isEnable && that_present_isEnable))
        return false;
      if (this.isEnable != that.isEnable)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_isEnable = true && (is_set_isEnable());
    builder.append(present_isEnable);
    if (present_isEnable)
      builder.append(isEnable);

    return builder.toHashCode();
  }

  public int compareTo(MonitorOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MonitorOptions typedOther = (MonitorOptions)other;

    lastComparison = Boolean.valueOf(is_set_isEnable()).compareTo(typedOther.is_set_isEnable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_isEnable()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.isEnable, typedOther.isEnable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // IS_ENABLE
          if (field.type == org.apache.thrift7.protocol.TType.BOOL) {
            this.isEnable = iprot.readBool();
            set_isEnable_isSet(true);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (is_set_isEnable()) {
      oprot.writeFieldBegin(IS_ENABLE_FIELD_DESC);
      oprot.writeBool(this.isEnable);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MonitorOptions(");
    boolean first = true;

    if (is_set_isEnable()) {
      sb.append("isEnable:");
      sb.append(this.isEnable);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
