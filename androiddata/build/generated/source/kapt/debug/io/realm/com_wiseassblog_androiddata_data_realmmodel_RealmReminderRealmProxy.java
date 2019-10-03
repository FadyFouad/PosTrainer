package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy extends com.wiseassblog.androiddata.data.realmmodel.RealmReminder
    implements RealmObjectProxy, com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface {

    static final class RealmReminderColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long reminderIdIndex;
        long reminderTitleIndex;
        long isActiveIndex;
        long isVibrateOnlyIndex;
        long isRenewAutomaticallyIndex;
        long hourOfDayIndex;
        long minuteIndex;

        RealmReminderColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmReminder");
            this.reminderIdIndex = addColumnDetails("reminderId", "reminderId", objectSchemaInfo);
            this.reminderTitleIndex = addColumnDetails("reminderTitle", "reminderTitle", objectSchemaInfo);
            this.isActiveIndex = addColumnDetails("isActive", "isActive", objectSchemaInfo);
            this.isVibrateOnlyIndex = addColumnDetails("isVibrateOnly", "isVibrateOnly", objectSchemaInfo);
            this.isRenewAutomaticallyIndex = addColumnDetails("isRenewAutomatically", "isRenewAutomatically", objectSchemaInfo);
            this.hourOfDayIndex = addColumnDetails("hourOfDay", "hourOfDay", objectSchemaInfo);
            this.minuteIndex = addColumnDetails("minute", "minute", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RealmReminderColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmReminderColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmReminderColumnInfo src = (RealmReminderColumnInfo) rawSrc;
            final RealmReminderColumnInfo dst = (RealmReminderColumnInfo) rawDst;
            dst.reminderIdIndex = src.reminderIdIndex;
            dst.reminderTitleIndex = src.reminderTitleIndex;
            dst.isActiveIndex = src.isActiveIndex;
            dst.isVibrateOnlyIndex = src.isVibrateOnlyIndex;
            dst.isRenewAutomaticallyIndex = src.isRenewAutomaticallyIndex;
            dst.hourOfDayIndex = src.hourOfDayIndex;
            dst.minuteIndex = src.minuteIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmReminderColumnInfo columnInfo;
    private ProxyState<com.wiseassblog.androiddata.data.realmmodel.RealmReminder> proxyState;

    com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmReminderColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.wiseassblog.androiddata.data.realmmodel.RealmReminder>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$reminderId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.reminderIdIndex);
    }

    @Override
    public void realmSet$reminderId(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'reminderId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$reminderTitle() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.reminderTitleIndex);
    }

    @Override
    public void realmSet$reminderTitle(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'reminderTitle' to null.");
            }
            row.getTable().setString(columnInfo.reminderTitleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'reminderTitle' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.reminderTitleIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isActive() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isActiveIndex);
    }

    @Override
    public void realmSet$isActive(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isActiveIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isActiveIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isVibrateOnly() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isVibrateOnlyIndex);
    }

    @Override
    public void realmSet$isVibrateOnly(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isVibrateOnlyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isVibrateOnlyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isRenewAutomatically() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isRenewAutomaticallyIndex);
    }

    @Override
    public void realmSet$isRenewAutomatically(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isRenewAutomaticallyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isRenewAutomaticallyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$hourOfDay() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.hourOfDayIndex);
    }

    @Override
    public void realmSet$hourOfDay(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.hourOfDayIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.hourOfDayIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$minute() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.minuteIndex);
    }

    @Override
    public void realmSet$minute(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.minuteIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.minuteIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("RealmReminder", 7, 0);
        builder.addPersistedProperty("reminderId", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("reminderTitle", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isActive", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isVibrateOnly", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isRenewAutomatically", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("hourOfDay", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("minute", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmReminderColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmReminderColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmReminder";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmReminder";
    }

    @SuppressWarnings("cast")
    public static com.wiseassblog.androiddata.data.realmmodel.RealmReminder createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.wiseassblog.androiddata.data.realmmodel.RealmReminder obj = null;
        if (update) {
            Table table = realm.getTable(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
            RealmReminderColumnInfo columnInfo = (RealmReminderColumnInfo) realm.getSchema().getColumnInfo(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
            long pkColumnIndex = columnInfo.reminderIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("reminderId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("reminderId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("reminderId")) {
                if (json.isNull("reminderId")) {
                    obj = (io.realm.com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy) realm.createObjectInternal(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy) realm.createObjectInternal(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class, json.getString("reminderId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'reminderId'.");
            }
        }

        final com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface objProxy = (com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) obj;
        if (json.has("reminderTitle")) {
            if (json.isNull("reminderTitle")) {
                objProxy.realmSet$reminderTitle(null);
            } else {
                objProxy.realmSet$reminderTitle((String) json.getString("reminderTitle"));
            }
        }
        if (json.has("isActive")) {
            if (json.isNull("isActive")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isActive' to null.");
            } else {
                objProxy.realmSet$isActive((boolean) json.getBoolean("isActive"));
            }
        }
        if (json.has("isVibrateOnly")) {
            if (json.isNull("isVibrateOnly")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isVibrateOnly' to null.");
            } else {
                objProxy.realmSet$isVibrateOnly((boolean) json.getBoolean("isVibrateOnly"));
            }
        }
        if (json.has("isRenewAutomatically")) {
            if (json.isNull("isRenewAutomatically")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isRenewAutomatically' to null.");
            } else {
                objProxy.realmSet$isRenewAutomatically((boolean) json.getBoolean("isRenewAutomatically"));
            }
        }
        if (json.has("hourOfDay")) {
            if (json.isNull("hourOfDay")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hourOfDay' to null.");
            } else {
                objProxy.realmSet$hourOfDay((int) json.getInt("hourOfDay"));
            }
        }
        if (json.has("minute")) {
            if (json.isNull("minute")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'minute' to null.");
            } else {
                objProxy.realmSet$minute((int) json.getInt("minute"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.wiseassblog.androiddata.data.realmmodel.RealmReminder createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.wiseassblog.androiddata.data.realmmodel.RealmReminder obj = new com.wiseassblog.androiddata.data.realmmodel.RealmReminder();
        final com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface objProxy = (com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("reminderId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$reminderId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$reminderId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("reminderTitle")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$reminderTitle((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$reminderTitle(null);
                }
            } else if (name.equals("isActive")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isActive((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isActive' to null.");
                }
            } else if (name.equals("isVibrateOnly")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isVibrateOnly((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isVibrateOnly' to null.");
                }
            } else if (name.equals("isRenewAutomatically")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isRenewAutomatically((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isRenewAutomatically' to null.");
                }
            } else if (name.equals("hourOfDay")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$hourOfDay((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hourOfDay' to null.");
                }
            } else if (name.equals("minute")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$minute((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'minute' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'reminderId'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class), false, Collections.<String>emptyList());
        io.realm.com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy obj = new io.realm.com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.wiseassblog.androiddata.data.realmmodel.RealmReminder copyOrUpdate(Realm realm, RealmReminderColumnInfo columnInfo, com.wiseassblog.androiddata.data.realmmodel.RealmReminder object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.wiseassblog.androiddata.data.realmmodel.RealmReminder) cachedRealmObject;
        }

        com.wiseassblog.androiddata.data.realmmodel.RealmReminder realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
            long pkColumnIndex = columnInfo.reminderIdIndex;
            String value = ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$reminderId();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.wiseassblog.androiddata.data.realmmodel.RealmReminder copy(Realm realm, RealmReminderColumnInfo columnInfo, com.wiseassblog.androiddata.data.realmmodel.RealmReminder newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.wiseassblog.androiddata.data.realmmodel.RealmReminder) cachedRealmObject;
        }

        com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface realmObjectSource = (com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) newObject;

        Table table = realm.getTable(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.reminderIdIndex, realmObjectSource.realmGet$reminderId());
        builder.addString(columnInfo.reminderTitleIndex, realmObjectSource.realmGet$reminderTitle());
        builder.addBoolean(columnInfo.isActiveIndex, realmObjectSource.realmGet$isActive());
        builder.addBoolean(columnInfo.isVibrateOnlyIndex, realmObjectSource.realmGet$isVibrateOnly());
        builder.addBoolean(columnInfo.isRenewAutomaticallyIndex, realmObjectSource.realmGet$isRenewAutomatically());
        builder.addInteger(columnInfo.hourOfDayIndex, realmObjectSource.realmGet$hourOfDay());
        builder.addInteger(columnInfo.minuteIndex, realmObjectSource.realmGet$minute());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.wiseassblog.androiddata.data.realmmodel.RealmReminder object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
        long tableNativePtr = table.getNativePtr();
        RealmReminderColumnInfo columnInfo = (RealmReminderColumnInfo) realm.getSchema().getColumnInfo(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
        long pkColumnIndex = columnInfo.reminderIdIndex;
        String primaryKeyValue = ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$reminderId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$reminderTitle = ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$reminderTitle();
        if (realmGet$reminderTitle != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.reminderTitleIndex, rowIndex, realmGet$reminderTitle, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isActiveIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isActive(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVibrateOnlyIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isVibrateOnly(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isRenewAutomaticallyIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isRenewAutomatically(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.hourOfDayIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$hourOfDay(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.minuteIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$minute(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
        long tableNativePtr = table.getNativePtr();
        RealmReminderColumnInfo columnInfo = (RealmReminderColumnInfo) realm.getSchema().getColumnInfo(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
        long pkColumnIndex = columnInfo.reminderIdIndex;
        com.wiseassblog.androiddata.data.realmmodel.RealmReminder object = null;
        while (objects.hasNext()) {
            object = (com.wiseassblog.androiddata.data.realmmodel.RealmReminder) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$reminderId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$reminderTitle = ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$reminderTitle();
            if (realmGet$reminderTitle != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.reminderTitleIndex, rowIndex, realmGet$reminderTitle, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isActiveIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isActive(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVibrateOnlyIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isVibrateOnly(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isRenewAutomaticallyIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isRenewAutomatically(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.hourOfDayIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$hourOfDay(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.minuteIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$minute(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.wiseassblog.androiddata.data.realmmodel.RealmReminder object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
        long tableNativePtr = table.getNativePtr();
        RealmReminderColumnInfo columnInfo = (RealmReminderColumnInfo) realm.getSchema().getColumnInfo(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
        long pkColumnIndex = columnInfo.reminderIdIndex;
        String primaryKeyValue = ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$reminderId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$reminderTitle = ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$reminderTitle();
        if (realmGet$reminderTitle != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.reminderTitleIndex, rowIndex, realmGet$reminderTitle, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.reminderTitleIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isActiveIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isActive(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVibrateOnlyIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isVibrateOnly(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isRenewAutomaticallyIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isRenewAutomatically(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.hourOfDayIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$hourOfDay(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.minuteIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$minute(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
        long tableNativePtr = table.getNativePtr();
        RealmReminderColumnInfo columnInfo = (RealmReminderColumnInfo) realm.getSchema().getColumnInfo(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
        long pkColumnIndex = columnInfo.reminderIdIndex;
        com.wiseassblog.androiddata.data.realmmodel.RealmReminder object = null;
        while (objects.hasNext()) {
            object = (com.wiseassblog.androiddata.data.realmmodel.RealmReminder) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$reminderId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$reminderTitle = ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$reminderTitle();
            if (realmGet$reminderTitle != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.reminderTitleIndex, rowIndex, realmGet$reminderTitle, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.reminderTitleIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isActiveIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isActive(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVibrateOnlyIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isVibrateOnly(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isRenewAutomaticallyIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$isRenewAutomatically(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.hourOfDayIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$hourOfDay(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.minuteIndex, rowIndex, ((com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) object).realmGet$minute(), false);
        }
    }

    public static com.wiseassblog.androiddata.data.realmmodel.RealmReminder createDetachedCopy(com.wiseassblog.androiddata.data.realmmodel.RealmReminder realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.wiseassblog.androiddata.data.realmmodel.RealmReminder unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.wiseassblog.androiddata.data.realmmodel.RealmReminder();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.wiseassblog.androiddata.data.realmmodel.RealmReminder) cachedObject.object;
            }
            unmanagedObject = (com.wiseassblog.androiddata.data.realmmodel.RealmReminder) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface unmanagedCopy = (com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) unmanagedObject;
        com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface realmSource = (com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$reminderId(realmSource.realmGet$reminderId());
        unmanagedCopy.realmSet$reminderTitle(realmSource.realmGet$reminderTitle());
        unmanagedCopy.realmSet$isActive(realmSource.realmGet$isActive());
        unmanagedCopy.realmSet$isVibrateOnly(realmSource.realmGet$isVibrateOnly());
        unmanagedCopy.realmSet$isRenewAutomatically(realmSource.realmGet$isRenewAutomatically());
        unmanagedCopy.realmSet$hourOfDay(realmSource.realmGet$hourOfDay());
        unmanagedCopy.realmSet$minute(realmSource.realmGet$minute());

        return unmanagedObject;
    }

    static com.wiseassblog.androiddata.data.realmmodel.RealmReminder update(Realm realm, RealmReminderColumnInfo columnInfo, com.wiseassblog.androiddata.data.realmmodel.RealmReminder realmObject, com.wiseassblog.androiddata.data.realmmodel.RealmReminder newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface realmObjectTarget = (com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) realmObject;
        com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface realmObjectSource = (com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxyInterface) newObject;
        Table table = realm.getTable(com.wiseassblog.androiddata.data.realmmodel.RealmReminder.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.reminderIdIndex, realmObjectSource.realmGet$reminderId());
        builder.addString(columnInfo.reminderTitleIndex, realmObjectSource.realmGet$reminderTitle());
        builder.addBoolean(columnInfo.isActiveIndex, realmObjectSource.realmGet$isActive());
        builder.addBoolean(columnInfo.isVibrateOnlyIndex, realmObjectSource.realmGet$isVibrateOnly());
        builder.addBoolean(columnInfo.isRenewAutomaticallyIndex, realmObjectSource.realmGet$isRenewAutomatically());
        builder.addInteger(columnInfo.hourOfDayIndex, realmObjectSource.realmGet$hourOfDay());
        builder.addInteger(columnInfo.minuteIndex, realmObjectSource.realmGet$minute());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmReminder = proxy[");
        stringBuilder.append("{reminderId:");
        stringBuilder.append(realmGet$reminderId() != null ? realmGet$reminderId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{reminderTitle:");
        stringBuilder.append(realmGet$reminderTitle());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isActive:");
        stringBuilder.append(realmGet$isActive());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isVibrateOnly:");
        stringBuilder.append(realmGet$isVibrateOnly());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isRenewAutomatically:");
        stringBuilder.append(realmGet$isRenewAutomatically());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{hourOfDay:");
        stringBuilder.append(realmGet$hourOfDay());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{minute:");
        stringBuilder.append(realmGet$minute());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy aRealmReminder = (com_wiseassblog_androiddata_data_realmmodel_RealmReminderRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aRealmReminder.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmReminder.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aRealmReminder.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
