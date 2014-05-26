/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_639NumbersTable extends org.jooq.impl.TableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = 218833624;

	/**
	 * The singleton instance of <code>t_639_numbers_table</code>
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.T_639NumbersTable T_639_NUMBERS_TABLE = new org.jooq.test.sqlite.generatedclasses.tables.T_639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord.class;
	}

	/**
	 * The column <code>t_639_numbers_table.ID</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.BYTE</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE = createField("BYTE", org.jooq.impl.SQLDataType.TINYINT, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.SHORT</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT = createField("SHORT", org.jooq.impl.SQLDataType.SMALLINT, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.INTEGER</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER = createField("INTEGER", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.LONG</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG = createField("LONG", org.jooq.impl.SQLDataType.BIGINT, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.BYTE_DECIMAL</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Object> BYTE_DECIMAL = createField("BYTE_DECIMAL", org.jooq.impl.DefaultDataType.getDefaultDataType("DECIMAL(2, 0)"), T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.SHORT_DECIMAL</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Object> SHORT_DECIMAL = createField("SHORT_DECIMAL", org.jooq.impl.DefaultDataType.getDefaultDataType("DECIMAL(4, 0)"), T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.INTEGER_DECIMAL</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Object> INTEGER_DECIMAL = createField("INTEGER_DECIMAL", org.jooq.impl.DefaultDataType.getDefaultDataType("DECIMAL(9, 0)"), T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.LONG_DECIMAL</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Object> LONG_DECIMAL = createField("LONG_DECIMAL", org.jooq.impl.DefaultDataType.getDefaultDataType("DECIMAL(18, 0)"), T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.BIG_INTEGER</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Object> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.DefaultDataType.getDefaultDataType("DECIMAL(22, 0)"), T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.BIG_DECIMAL</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Object> BIG_DECIMAL = createField("BIG_DECIMAL", org.jooq.impl.DefaultDataType.getDefaultDataType("DECIMAL(22, 5)"), T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.FLOAT</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Float> FLOAT = createField("FLOAT", org.jooq.impl.SQLDataType.REAL, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.DOUBLE</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> DOUBLE = createField("DOUBLE", org.jooq.impl.SQLDataType.DOUBLE, T_639_NUMBERS_TABLE, "");

	/**
	 * No further instances allowed
	 */
	private T_639NumbersTable() {
		this("t_639_numbers_table", null);
	}

	private T_639NumbersTable(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> aliased) {
		this(alias, aliased, null);
	}

	private T_639NumbersTable(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sqlite.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> getPrimaryKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE);
	}
}