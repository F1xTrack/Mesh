package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.rn.push.constants.LocalNotification;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: Uz1 */
/* loaded from: classes.dex */
public final class C1656Uz1 extends AbstractC3985gY1 {
    public static final String[] g = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] h = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;"};
    public static final String[] i = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] j = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", LocalNotification.Repeat.Type.DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};
    public static final String[] k = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] l = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] m = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] n = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] o = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] p = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] q = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final AA1 e;
    public final C0617Hr f;

    public C1656Uz1(C5716lY1 c5716lY1) {
        super(c5716lY1);
        this.f = new C0617Hr(((C3386dP1) this.b).n);
        this.e = new AA1(this, ((C3386dP1) this.b).a);
    }

    public static void R1(ContentValues contentValues, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public static String m2(ArrayList arrayList) {
        return arrayList.isEmpty() ? "" : AbstractC8235ym.k(" AND (upload_type IN (", TextUtils.join(", ", arrayList), "))");
    }

    public final void A2(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        v1();
        z1();
        try {
            C1().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            OL1 ol1N = n();
            ol1N.g.e("Error deleting user property. appId", OL1.B1(str), ((C3386dP1) this.b).m.g(str2), e);
        }
    }

    @Override // defpackage.AbstractC3985gY1
    public final boolean B1() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ZY1 B2(java.lang.String r25) throws java.lang.Throwable {
        /*
            r24 = this;
            r12 = r24
            r13 = r25
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r25)
            r24.v1()
            r24.z1()
            java.lang.Object r0 = r12.b
            dP1 r0 = (defpackage.C3386dP1) r0
            Py1 r1 = r0.g
            GJ1 r2 = defpackage.IB1.I0
            r14 = 0
            boolean r1 = r1.E1(r14, r2)
            if (r1 != 0) goto L1d
            return r14
        L1d:
            GJ1 r1 = defpackage.IB1.K0
            Py1 r0 = r0.g
            boolean r0 = r0.E1(r14, r1)
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L44
            int[] r0 = new int[]{r1}
            VX1 r0 = defpackage.VX1.i0(r0)
            r1 = 1
            java.util.List r0 = r12.L1(r13, r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3d
            return r14
        L3d:
            java.lang.Object r0 = r0.get(r2)
            ZY1 r0 = (defpackage.ZY1) r0
            return r0
        L44:
            android.database.sqlite.SQLiteDatabase r3 = r24.C1()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r4 = "upload_queue"
            java.lang.String r15 = "rowId"
            java.lang.String r16 = "app_id"
            java.lang.String r17 = "measurement_batch"
            java.lang.String r18 = "upload_uri"
            java.lang.String r19 = "upload_headers"
            java.lang.String r20 = "upload_type"
            java.lang.String r21 = "retry_count"
            java.lang.String r22 = "creation_timestamp"
            java.lang.String r23 = "associated_row_id"
            java.lang.String[] r5 = new java.lang.String[]{r15, r16, r17, r18, r19, r20, r21, r22, r23}     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r0 = r24.i2()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r7 = "app_id=? AND NOT "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            r6.append(r0)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String[] r7 = new java.lang.String[]{r25}     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r10 = "creation_timestamp ASC"
            java.lang.String r11 = "1"
            r8 = 0
            r9 = 0
            android.database.Cursor r15 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            boolean r0 = r15.moveToFirst()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
            if (r0 != 0) goto L8a
            r15.close()
            return r14
        L8a:
            long r3 = r15.getLong(r2)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
            byte[] r5 = r15.getBlob(r1)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
            r0 = 3
            java.lang.String r6 = r15.getString(r0)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
            r0 = 4
            java.lang.String r7 = r15.getString(r0)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
            r0 = 5
            int r8 = r15.getInt(r0)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
            r0 = 6
            int r9 = r15.getInt(r0)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
            r0 = 7
            r15.getLong(r0)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
            r0 = 8
            long r10 = r15.getLong(r0)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
            r1 = r24
            r2 = r25
            ZY1 r0 = r1.P1(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
            r15.close()
            return r0
        Lbc:
            r0 = move-exception
            r14 = r15
            goto Ld6
        Lbf:
            r0 = move-exception
            goto Lc5
        Lc1:
            r0 = move-exception
            goto Ld6
        Lc3:
            r0 = move-exception
            r15 = r14
        Lc5:
            OL1 r1 = r24.n()     // Catch: java.lang.Throwable -> Lbc
            rx r1 = r1.g     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = "Error to querying MeasurementBatch from upload_queue. appId"
            r1.b(r13, r0, r2)     // Catch: java.lang.Throwable -> Lbc
            if (r15 == 0) goto Ld5
            r15.close()
        Ld5:
            return r14
        Ld6:
            if (r14 == 0) goto Ldb
            r14.close()
        Ldb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.B2(java.lang.String):ZY1");
    }

    public final SQLiteDatabase C1() {
        v1();
        try {
            return this.e.getWritableDatabase();
        } catch (SQLiteException e) {
            n().j.c(e, "Error opening database");
            throw e;
        }
    }

    public final boolean C2(String str, String str2) {
        return k2("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String D1() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.C1()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3a
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3a
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            OL1 r3 = r6.n()     // Catch: java.lang.Throwable -> L1a
            rx r3 = r3.g     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.c(r2, r4)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.D1():java.lang.String");
    }

    public final void D2(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        v1();
        z1();
        try {
            C1().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            OL1 ol1N = n();
            ol1N.g.b(OL1.B1(str2), e, "Error deleting snapshot. appId");
        }
    }

    public final long E1(String str) {
        Preconditions.checkNotEmpty(str);
        v1();
        z1();
        try {
            return C1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, ((C3386dP1) this.b).g.z1(str, IB1.q))))});
        } catch (SQLiteException e) {
            n().g.b(OL1.B1(str), e, "Error deleting over the limit events. appId");
            return 0L;
        }
    }

    public final List E2(String str) {
        Preconditions.checkNotEmpty(str);
        v1();
        z1();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = C1().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j2 = cursorQuery.getLong(2);
                    Object objI1 = I1(cursorQuery, 3);
                    if (objI1 == null) {
                        n().g.c(OL1.B1(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new C6483pZ1(str, str2, string, j2, objI1));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                n().g.b(OL1.B1(str), e, "Error querying user properties. appId");
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final long F1(String str, QK1 qk1, String str2, Map map, int i2, Long l2) {
        int iDelete;
        v1();
        z1();
        Preconditions.checkNotNull(qk1);
        Preconditions.checkNotEmpty(str);
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (!c3386dP1.g.E1(null, IB1.I0)) {
            return -1L;
        }
        v1();
        z1();
        boolean zH2 = h2();
        Clock clock = c3386dP1.n;
        if (zH2) {
            C5716lY1 c5716lY1 = this.c;
            long jG = c5716lY1.i.g.g();
            long jElapsedRealtime = clock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jG) > ((Long) IB1.I.a(null)).longValue()) {
                c5716lY1.i.g.h(jElapsedRealtime);
                v1();
                z1();
                if (h2() && (iDelete = C1().delete("upload_queue", i2(), new String[0])) > 0) {
                    n().o.c(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                GJ1 gj1 = IB1.K0;
                C1263Py1 c1263Py1 = c3386dP1.g;
                if (c1263Py1.E1(null, gj1)) {
                    Preconditions.checkNotEmpty(str);
                    v1();
                    z1();
                    try {
                        int iZ1 = c1263Py1.z1(str, IB1.w);
                        if (iZ1 > 0) {
                            C1().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iZ1)});
                        }
                    } catch (SQLiteException e) {
                        n().g.b(OL1.B1(str), e, "Error deleting over the limit queued batches. appId");
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((String) entry.getValue()));
        }
        byte[] bArrC = qk1.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrC);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i3 = 1;
            while (i3 < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i3);
                i3++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(RI1.f(i2)));
        contentValues.put("creation_timestamp", Long.valueOf(clock.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l2 != null) {
            contentValues.put("associated_row_id", l2);
        }
        try {
            long jInsert = C1().insert("upload_queue", null, contentValues);
            if (jInsert == -1) {
                n().g.c(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            }
            return jInsert;
        } catch (SQLiteException e2) {
            n().g.b(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    public final void F2(String str) {
        C6411pB1 c6411pB1T2;
        D2("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = C1().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (c6411pB1T2 = t2("events", str, string)) != null) {
                        W1("events_snapshot", c6411pB1T2);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e) {
                n().g.b(OL1.B1(str), e, "Error creating snapshot. appId");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final long G1(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = C1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j2;
                }
                long j3 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j3;
            } catch (SQLiteException e) {
                n().g.b(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G2(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.G2(java.lang.String):void");
    }

    public final long H1(SK1 sk1) {
        v1();
        z1();
        Preconditions.checkNotNull(sk1);
        Preconditions.checkNotEmpty(sk1.D());
        byte[] bArrC = sk1.c();
        long jD1 = w1().D1(bArrC);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", sk1.D());
        contentValues.put("metadata_fingerprint", Long.valueOf(jD1));
        contentValues.put("metadata", bArrC);
        try {
            C1().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jD1;
        } catch (SQLiteException e) {
            OL1 ol1N = n();
            ol1N.g.b(OL1.B1(sk1.D()), e, "Error storing raw event metadata. appId");
            throw e;
        }
    }

    public final void H2() {
        z1();
        C1().beginTransaction();
    }

    public final Object I1(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            n().g.d("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type == 4) {
            n().g.d("Loaded invalid blob type value, ignoring it");
            return null;
        }
        OL1 ol1N = n();
        ol1N.g.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    public final boolean I2(String str) {
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if (!c3386dP1.g.E1(null, IB1.I0)) {
            return false;
        }
        if (!c3386dP1.g.E1(null, IB1.K0)) {
            return k2(AbstractC8235ym.v("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ", i2()), new String[]{str}) != 0;
        }
        int[] iArr = {2};
        ArrayList arrayList = new ArrayList(1);
        for (int i2 = 0; i2 <= 0; i2++) {
            arrayList.add(Integer.valueOf(RI1.f(iArr[0])));
        }
        return k2(AbstractC1705Vq.i("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", m2(arrayList), " AND NOT ", i2()), new String[]{str}) != 0;
    }

    public final String J1(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = C1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                n().g.b(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void J2() {
        z1();
        C1().endTransaction();
    }

    public final List K1(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        v1();
        z1();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return M1(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void K2() {
        int iDelete;
        v1();
        z1();
        if (h2()) {
            C5716lY1 c5716lY1 = this.c;
            long jG = c5716lY1.i.f.g();
            C3386dP1 c3386dP1 = (C3386dP1) this.b;
            long jElapsedRealtime = c3386dP1.n.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jG) > ((Long) IB1.I.a(null)).longValue()) {
                c5716lY1.i.f.h(jElapsedRealtime);
                v1();
                z1();
                if (!h2() || (iDelete = C1().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(c3386dP1.n.currentTimeMillis()), String.valueOf(((Long) IB1.N.a(null)).longValue())})) <= 0) {
                    return;
                }
                n().o.c(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
            }
        }
    }

    public final List L1(String str, VX1 vx1, int i2) throws Throwable {
        Cursor cursor = null;
        if (!((C3386dP1) this.b).g.E1(null, IB1.K0)) {
            return Collections.emptyList();
        }
        Preconditions.checkNotEmpty(str);
        v1();
        z1();
        try {
            try {
                Cursor cursorQuery = C1().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id"}, "app_id=?" + m2(vx1.a) + " AND NOT " + i2(), new String[]{str}, null, null, "creation_timestamp ASC", i2 > 0 ? String.valueOf(i2) : null);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorQuery.moveToNext()) {
                        long j2 = cursorQuery.getLong(0);
                        byte[] blob = cursorQuery.getBlob(2);
                        String string = cursorQuery.getString(3);
                        String string2 = cursorQuery.getString(4);
                        int i3 = cursorQuery.getInt(5);
                        int i4 = cursorQuery.getInt(6);
                        cursorQuery.getLong(7);
                        ZY1 zy1P1 = P1(str, j2, blob, string, string2, i3, i4, cursorQuery.getLong(8));
                        if (zy1P1 != null) {
                            arrayList.add(zy1P1);
                        }
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = cursorQuery;
                    n().g.b(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
                    List listEmptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void L2() {
        z1();
        C1().setTransactionSuccessful();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0050, code lost:
    
        n().g.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List M1(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.M1(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final C2084aA1 N1(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Preconditions.checkNotEmpty(str);
        v1();
        z1();
        String[] strArr = {str};
        C2084aA1 c2084aA1 = new C2084aA1();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseC1 = C1();
                Cursor cursorQuery = sQLiteDatabaseC1.query("apps", new String[]{LocalNotification.Repeat.Type.DAY, "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    n().j.c(OL1.B1(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return c2084aA1;
                }
                if (cursorQuery.getLong(0) == j2) {
                    c2084aA1.b = cursorQuery.getLong(1);
                    c2084aA1.a = cursorQuery.getLong(2);
                    c2084aA1.c = cursorQuery.getLong(3);
                    c2084aA1.d = cursorQuery.getLong(4);
                    c2084aA1.e = cursorQuery.getLong(5);
                    c2084aA1.f = cursorQuery.getLong(6);
                    c2084aA1.g = cursorQuery.getLong(7);
                }
                if (z) {
                    c2084aA1.b += j3;
                }
                if (z2) {
                    c2084aA1.a += j3;
                }
                if (z3) {
                    c2084aA1.c += j3;
                }
                if (z4) {
                    c2084aA1.d += j3;
                }
                if (z5) {
                    c2084aA1.e += j3;
                }
                if (z6) {
                    c2084aA1.f += j3;
                }
                if (z7) {
                    c2084aA1.g += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put(LocalNotification.Repeat.Type.DAY, Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(c2084aA1.a));
                contentValues.put("daily_events_count", Long.valueOf(c2084aA1.b));
                contentValues.put("daily_conversions_count", Long.valueOf(c2084aA1.c));
                contentValues.put("daily_error_events_count", Long.valueOf(c2084aA1.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c2084aA1.e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c2084aA1.f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(c2084aA1.g));
                sQLiteDatabaseC1.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c2084aA1;
            } catch (SQLiteException e) {
                n().g.b(OL1.B1(str), e, "Error updating daily counts. appId");
                if (0 != 0) {
                    cursor.close();
                }
                return c2084aA1;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final C2084aA1 O1(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return N1(j2, str, 1L, false, false, z, false, z2, z3, z4);
    }

    public final ZY1 P1(String str, long j2, byte[] bArr, String str2, String str3, int i2, int i3, long j3) {
        if (TextUtils.isEmpty(str2)) {
            n().n.d("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            PK1 pk1 = (PK1) C2540cZ1.P1(QK1.v(), bArr);
            int i4 = 6;
            int[] iArrC = AbstractC8235ym.C(6);
            int length = iArrC.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                int i6 = iArrC[i5];
                if (RI1.f(i6) == i2) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            if (i4 != 2 && i4 != 5 && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((QK1) pk1.b).y()).iterator();
                while (it.hasNext()) {
                    RK1 rk1 = (RK1) ((SK1) it.next()).j();
                    rk1.i();
                    SK1.s1((SK1) rk1.b, i3);
                    arrayList.add((SK1) rk1.e());
                }
                pk1.i();
                QK1.t((QK1) pk1.b);
                pk1.i();
                QK1.r((QK1) pk1.b, arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length2 = strArrSplit.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        break;
                    }
                    String str4 = strArrSplit[i7];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
                    if (strArrSplit2.length != 2) {
                        n().g.c(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i7++;
                }
            }
            QK1 qk1 = (QK1) pk1.e();
            ZY1 zy1 = new ZY1();
            zy1.a = j2;
            zy1.b = qk1;
            zy1.c = str2;
            zy1.d = map;
            zy1.e = i4;
            zy1.f = j3;
            return zy1;
        } catch (IOException e) {
            n().g.b(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final void Q1(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseC1 = C1();
            if (contentValues.getAsString("app_id") == null) {
                n().i.c(OL1.B1("app_id"), "Value of the primary key is not set.");
            } else if (sQLiteDatabaseC1.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && sQLiteDatabaseC1.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                n().g.b(OL1.B1("consent_settings"), OL1.B1("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            n().g.e("Error storing into table. key", OL1.B1("consent_settings"), OL1.B1("app_id"), e);
        }
    }

    public final void S1(Long l2) {
        v1();
        z1();
        Preconditions.checkNotNull(l2);
        if (((C3386dP1) this.b).g.E1(null, IB1.I0)) {
            try {
                if (C1().delete("upload_queue", "rowid=?", new String[]{String.valueOf(l2)}) != 1) {
                    n().j.d("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e) {
                n().g.c(e, "Failed to delete a MeasurementBatch in a upload_queue table");
                throw e;
            }
        }
    }

    public final void T1(String str, Long l2, long j2, KK1 kk1) {
        v1();
        z1();
        Preconditions.checkNotNull(kk1);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l2);
        byte[] bArrC = kk1.c();
        OL1 ol1N = n();
        ol1N.o.b(((C3386dP1) this.b).m.b(str), Integer.valueOf(bArrC.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrC);
        try {
            if (C1().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                n().g.c(OL1.B1(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            OL1 ol1N2 = n();
            ol1N2.g.b(OL1.B1(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0262 A[Catch: SQLiteException -> 0x0276, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0276, blocks: (B:208:0x0247, B:210:0x0262), top: B:219:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0122 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U1(java.lang.String r26, java.lang.Long r27, java.lang.String r28, android.os.Bundle r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.U1(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    public final void V1(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        v1();
        z1();
        try {
            C1().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            OL1 ol1N = n();
            ol1N.g.e("Error deleting conditional property", OL1.B1(str), ((C3386dP1) this.b).m.g(str2), e);
        }
    }

    public final void W1(String str, C6411pB1 c6411pB1) {
        Preconditions.checkNotNull(c6411pB1);
        v1();
        z1();
        ContentValues contentValues = new ContentValues();
        String str2 = c6411pB1.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c6411pB1.b);
        contentValues.put("lifetime_count", Long.valueOf(c6411pB1.c));
        contentValues.put("current_bundle_count", Long.valueOf(c6411pB1.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c6411pB1.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c6411pB1.g));
        contentValues.put("last_bundled_day", c6411pB1.h);
        contentValues.put("last_sampled_complex_event_id", c6411pB1.i);
        contentValues.put("last_sampling_rate", c6411pB1.j);
        contentValues.put("current_session_count", Long.valueOf(c6411pB1.e));
        Boolean bool = c6411pB1.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (C1().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                n().g.c(OL1.B1(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            n().g.b(OL1.B1(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void X1(String str, XQ1 xq1) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(xq1);
        v1();
        z1();
        q2(str, z2(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", xq1.l());
        Q1(contentValues);
    }

    public final void Y1(String str, C8382zX1 c8382zX1) {
        v1();
        z1();
        Preconditions.checkNotNull(c8382zX1);
        Preconditions.checkNotEmpty(str);
        long jCurrentTimeMillis = ((C3386dP1) this.b).n.currentTimeMillis();
        GJ1 gj1 = IB1.q0;
        long jLongValue = jCurrentTimeMillis - ((Long) gj1.a(null)).longValue();
        long j2 = c8382zX1.b;
        if (j2 < jLongValue || j2 > ((Long) gj1.a(null)).longValue() + jCurrentTimeMillis) {
            OL1 ol1N = n();
            ol1N.j.e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", OL1.B1(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j2));
        }
        n().o.d("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c8382zX1.a);
        contentValues.put("source", Integer.valueOf(c8382zX1.c));
        contentValues.put("timestamp_millis", Long.valueOf(j2));
        try {
            if (C1().insert("trigger_uris", null, contentValues) == -1) {
                n().g.c(OL1.B1(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            OL1 ol1N2 = n();
            ol1N2.g.b(OL1.B1(str), e, "Error storing trigger URI. appId");
        }
    }

    public final void Z1(List list) throws SQLException {
        v1();
        z1();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (h2()) {
            String strK = AbstractC8235ym.k("(", TextUtils.join(StringUtils.COMMA, list), ")");
            if (k2("SELECT COUNT(1) FROM queue WHERE rowid IN " + strK + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                n().j.d("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                C1().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strK + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                n().g.c(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void a2(SK1 sk1, boolean z) {
        v1();
        z1();
        Preconditions.checkNotNull(sk1);
        Preconditions.checkNotEmpty(sk1.D());
        Preconditions.checkState(sk1.v0());
        K2();
        long jCurrentTimeMillis = ((C3386dP1) this.b).n.currentTimeMillis();
        long jQ1 = sk1.Q1();
        GJ1 gj1 = IB1.N;
        if (jQ1 < jCurrentTimeMillis - ((Long) gj1.a(null)).longValue() || sk1.Q1() > ((Long) gj1.a(null)).longValue() + jCurrentTimeMillis) {
            OL1 ol1N = n();
            ol1N.j.e("Storing bundle outside of the max uploading time span. appId, now, timestamp", OL1.B1(sk1.D()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(sk1.Q1()));
        }
        try {
            byte[] bArrG2 = w1().g2(sk1.c());
            OL1 ol1N2 = n();
            ol1N2.o.c(Integer.valueOf(bArrG2.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", sk1.D());
            contentValues.put("bundle_end_timestamp", Long.valueOf(sk1.Q1()));
            contentValues.put("data", bArrG2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (sk1.C0()) {
                contentValues.put("retry_count", Integer.valueOf(sk1.l1()));
            }
            try {
                if (C1().insert("queue", null, contentValues) == -1) {
                    n().g.c(OL1.B1(sk1.D()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                OL1 ol1N3 = n();
                ol1N3.g.b(OL1.B1(sk1.D()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            OL1 ol1N4 = n();
            ol1N4.g.b(OL1.B1(sk1.D()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void b2(PM1 pm1, boolean z) {
        Preconditions.checkNotNull(pm1);
        v1();
        z1();
        String strF = pm1.f();
        Preconditions.checkNotNull(strF);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strF);
        TQ1 tq1 = TQ1.ANALYTICS_STORAGE;
        C5716lY1 c5716lY1 = this.c;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (c5716lY1.J(strF).i(tq1)) {
            contentValues.put("app_instance_id", pm1.g());
        }
        contentValues.put("gmp_app_id", pm1.j());
        boolean zI = c5716lY1.J(strF).i(TQ1.AD_STORAGE);
        C3386dP1 c3386dP1 = pm1.a;
        if (zI) {
            C7595vO1 c7595vO1 = c3386dP1.j;
            C3386dP1.e(c7595vO1);
            c7595vO1.v1();
            contentValues.put("resettable_device_id_hash", pm1.e);
        }
        C7595vO1 c7595vO12 = c3386dP1.j;
        C3386dP1.e(c7595vO12);
        c7595vO12.v1();
        contentValues.put("last_bundle_index", Long.valueOf(pm1.g));
        C7595vO1 c7595vO13 = c3386dP1.j;
        C3386dP1.e(c7595vO13);
        c7595vO13.v1();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(pm1.h));
        C7595vO1 c7595vO14 = c3386dP1.j;
        C3386dP1.e(c7595vO14);
        c7595vO14.v1();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(pm1.i));
        contentValues.put("app_version", pm1.h());
        C7595vO1 c7595vO15 = c3386dP1.j;
        C3386dP1.e(c7595vO15);
        c7595vO15.v1();
        contentValues.put("app_store", pm1.l);
        C7595vO1 c7595vO16 = c3386dP1.j;
        C3386dP1.e(c7595vO16);
        c7595vO16.v1();
        contentValues.put("gmp_version", Long.valueOf(pm1.m));
        C7595vO1 c7595vO17 = c3386dP1.j;
        C3386dP1.e(c7595vO17);
        c7595vO17.v1();
        contentValues.put("dev_cert_hash", Long.valueOf(pm1.n));
        C7595vO1 c7595vO18 = c3386dP1.j;
        C3386dP1.e(c7595vO18);
        c7595vO18.v1();
        contentValues.put("measurement_enabled", Boolean.valueOf(pm1.o));
        C7595vO1 c7595vO19 = c3386dP1.j;
        C3386dP1.e(c7595vO19);
        c7595vO19.v1();
        contentValues.put(LocalNotification.Repeat.Type.DAY, Long.valueOf(pm1.K));
        C7595vO1 c7595vO110 = c3386dP1.j;
        C3386dP1.e(c7595vO110);
        c7595vO110.v1();
        contentValues.put("daily_public_events_count", Long.valueOf(pm1.L));
        C3386dP1.e(c7595vO110);
        c7595vO110.v1();
        contentValues.put("daily_events_count", Long.valueOf(pm1.M));
        C3386dP1.e(c7595vO110);
        c7595vO110.v1();
        contentValues.put("daily_conversions_count", Long.valueOf(pm1.N));
        C7595vO1 c7595vO111 = c3386dP1.j;
        C3386dP1.e(c7595vO111);
        c7595vO111.v1();
        contentValues.put("config_fetched_time", Long.valueOf(pm1.S));
        C7595vO1 c7595vO112 = c3386dP1.j;
        C3386dP1.e(c7595vO112);
        c7595vO112.v1();
        contentValues.put("failed_config_fetch_time", Long.valueOf(pm1.T));
        contentValues.put("app_version_int", Long.valueOf(pm1.y()));
        contentValues.put("firebase_instance_id", pm1.i());
        C3386dP1.e(c7595vO110);
        c7595vO110.v1();
        contentValues.put("daily_error_events_count", Long.valueOf(pm1.O));
        C3386dP1.e(c7595vO110);
        c7595vO110.v1();
        contentValues.put("daily_realtime_events_count", Long.valueOf(pm1.P));
        C3386dP1.e(c7595vO110);
        c7595vO110.v1();
        contentValues.put("health_monitor_sample", pm1.Q);
        contentValues.put("android_id", (Long) 0L);
        C7595vO1 c7595vO113 = c3386dP1.j;
        C3386dP1.e(c7595vO113);
        c7595vO113.v1();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(pm1.p));
        contentValues.put("admob_app_id", pm1.d());
        contentValues.put("dynamite_version", Long.valueOf(pm1.N()));
        if (c5716lY1.J(strF).i(tq1)) {
            C7595vO1 c7595vO114 = c3386dP1.j;
            C3386dP1.e(c7595vO114);
            c7595vO114.v1();
            contentValues.put("session_stitching_token", pm1.u);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(pm1.n()));
        C7595vO1 c7595vO115 = c3386dP1.j;
        C3386dP1.e(c7595vO115);
        c7595vO115.v1();
        contentValues.put("target_os_version", Long.valueOf(pm1.w));
        C7595vO1 c7595vO116 = c3386dP1.j;
        C3386dP1.e(c7595vO116);
        c7595vO116.v1();
        contentValues.put("session_stitching_token_hash", Long.valueOf(pm1.x));
        C7434uY1.a();
        C3386dP1 c3386dP12 = (C3386dP1) this.b;
        if (c3386dP12.g.E1(strF, IB1.Q0)) {
            C7595vO1 c7595vO117 = c3386dP1.j;
            C3386dP1.e(c7595vO117);
            c7595vO117.v1();
            contentValues.put("ad_services_version", Integer.valueOf(pm1.y));
            C7595vO1 c7595vO118 = c3386dP1.j;
            C3386dP1.e(c7595vO118);
            c7595vO118.v1();
            contentValues.put("attribution_eligibility_status", Long.valueOf(pm1.C));
        }
        C7595vO1 c7595vO119 = c3386dP1.j;
        C3386dP1.e(c7595vO119);
        c7595vO119.v1();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(pm1.z));
        contentValues.put("npa_metadata_value", pm1.U());
        C7595vO1 c7595vO120 = c3386dP1.j;
        C3386dP1.e(c7595vO120);
        c7595vO120.v1();
        contentValues.put("bundle_delivery_index", Long.valueOf(pm1.G));
        contentValues.put("sgtm_preview_key", pm1.l());
        C3386dP1.e(c7595vO110);
        c7595vO110.v1();
        contentValues.put("dma_consent_state", Integer.valueOf(pm1.E));
        C3386dP1.e(c7595vO110);
        c7595vO110.v1();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(pm1.F));
        contentValues.put("serialized_npa_metadata", pm1.k());
        GJ1 gj1 = IB1.K0;
        C1263Py1 c1263Py1 = c3386dP12.g;
        if (c1263Py1.E1(strF, gj1)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(pm1.o()));
        }
        C7595vO1 c7595vO121 = c3386dP1.j;
        C3386dP1.e(c7595vO121);
        c7595vO121.v1();
        ArrayList arrayList = pm1.t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                n().j.c(strF, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(StringUtils.COMMA, arrayList));
            }
        }
        AX1.b.get();
        if (c1263Py1.E1(null, IB1.F0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C7595vO1 c7595vO122 = c3386dP1.j;
        C3386dP1.e(c7595vO122);
        c7595vO122.v1();
        contentValues.put("unmatched_pfo", pm1.A);
        C7595vO1 c7595vO123 = c3386dP1.j;
        C3386dP1.e(c7595vO123);
        c7595vO123.v1();
        contentValues.put("unmatched_uwa", pm1.B);
        C7595vO1 c7595vO124 = c3386dP1.j;
        C3386dP1.e(c7595vO124);
        c7595vO124.v1();
        contentValues.put("ad_campaign_info", pm1.I);
        try {
            SQLiteDatabase sQLiteDatabaseC1 = C1();
            if (sQLiteDatabaseC1.update("apps", contentValues, "app_id = ?", new String[]{strF}) == 0 && sQLiteDatabaseC1.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                n().g.c(OL1.B1(strF), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            n().g.b(OL1.B1(strF), e, "Error storing app. appId");
        }
    }

    public final boolean c2(ZE ze, long j2, boolean z) {
        v1();
        z1();
        Preconditions.checkNotNull(ze);
        String str = (String) ze.d;
        Preconditions.checkNotEmpty(str);
        byte[] bArrC = w1().N1(ze).c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", (String) ze.e);
        contentValues.put("timestamp", Long.valueOf(ze.b));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", bArrC);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (C1().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            n().g.c(OL1.B1(str), "Failed to insert raw event (got -1). appId");
            return false;
        } catch (SQLiteException e) {
            OL1 ol1N = n();
            ol1N.g.b(OL1.B1(str), e, "Error storing raw event. appId");
            return false;
        }
    }

    public final boolean d2(String str, int i2, C6816rJ1 c6816rJ1) {
        z1();
        v1();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(c6816rJ1);
        if (c6816rJ1.t().isEmpty()) {
            n().j.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", OL1.B1(str), Integer.valueOf(i2), String.valueOf(c6816rJ1.z() ? Integer.valueOf(c6816rJ1.q()) : null));
            return false;
        }
        byte[] bArrC = c6816rJ1.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", c6816rJ1.z() ? Integer.valueOf(c6816rJ1.q()) : null);
        contentValues.put("event_name", c6816rJ1.t());
        contentValues.put("session_scoped", c6816rJ1.A() ? Boolean.valueOf(c6816rJ1.x()) : null);
        contentValues.put("data", bArrC);
        try {
            if (C1().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            n().g.c(OL1.B1(str), "Failed to insert event filter (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            n().g.b(OL1.B1(str), e, "Error storing event filter. appId");
            return false;
        }
    }

    public final boolean e2(String str, int i2, C7960xJ1 c7960xJ1) {
        z1();
        v1();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(c7960xJ1);
        if (c7960xJ1.q().isEmpty()) {
            n().j.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", OL1.B1(str), Integer.valueOf(i2), String.valueOf(c7960xJ1.u() ? Integer.valueOf(c7960xJ1.m()) : null));
            return false;
        }
        byte[] bArrC = c7960xJ1.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", c7960xJ1.u() ? Integer.valueOf(c7960xJ1.m()) : null);
        contentValues.put("property_name", c7960xJ1.q());
        contentValues.put("session_scoped", c7960xJ1.v() ? Boolean.valueOf(c7960xJ1.t()) : null);
        contentValues.put("data", bArrC);
        try {
            if (C1().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            n().g.c(OL1.B1(str), "Failed to insert property filter (got -1). appId");
            return false;
        } catch (SQLiteException e) {
            n().g.b(OL1.B1(str), e, "Error storing property filter. appId");
            return false;
        }
    }

    public final boolean f2(C0406Ey1 c0406Ey1) {
        Preconditions.checkNotNull(c0406Ey1);
        v1();
        z1();
        String str = c0406Ey1.a;
        Preconditions.checkNotNull(str);
        if (v2(str, c0406Ey1.c.b) == null && k2("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c0406Ey1.b);
        contentValues.put("name", c0406Ey1.c.b);
        R1(contentValues, Preconditions.checkNotNull(c0406Ey1.c.zza()));
        contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.valueOf(c0406Ey1.e));
        contentValues.put("trigger_event_name", c0406Ey1.f);
        contentValues.put("trigger_timeout", Long.valueOf(c0406Ey1.h));
        u1();
        contentValues.put("timed_out_event", C5910mZ1.l2(c0406Ey1.g));
        contentValues.put("creation_timestamp", Long.valueOf(c0406Ey1.d));
        u1();
        contentValues.put("triggered_event", C5910mZ1.l2(c0406Ey1.i));
        contentValues.put("triggered_timestamp", Long.valueOf(c0406Ey1.c.c));
        contentValues.put("time_to_live", Long.valueOf(c0406Ey1.j));
        u1();
        contentValues.put("expired_event", C5910mZ1.l2(c0406Ey1.k));
        try {
            if (C1().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            n().g.c(OL1.B1(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            OL1 ol1N = n();
            ol1N.g.b(OL1.B1(str), e, "Error storing conditional user property");
            return true;
        }
    }

    public final boolean g2(C6483pZ1 c6483pZ1) {
        Preconditions.checkNotNull(c6483pZ1);
        v1();
        z1();
        String str = c6483pZ1.a;
        String str2 = c6483pZ1.c;
        C6483pZ1 c6483pZ1V2 = v2(str, str2);
        String str3 = c6483pZ1.b;
        if (c6483pZ1V2 == null) {
            if (C5910mZ1.C2(str2)) {
                if (k2("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(((C3386dP1) this.b).g.z1(str, IB1.R), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && k2("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(c6483pZ1.d));
        R1(contentValues, c6483pZ1.e);
        try {
            if (C1().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            n().g.c(OL1.B1(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            n().g.b(OL1.B1(str), e, "Error storing user property. appId");
            return true;
        }
    }

    public final boolean h2() {
        return ((C3386dP1) this.b).a.getDatabasePath("google_app_measurement.db").exists();
    }

    public final String i2() {
        long jCurrentTimeMillis = ((C3386dP1) this.b).n.currentTimeMillis();
        Locale locale = Locale.US;
        Long l2 = (Long) IB1.O.a(null);
        l2.getClass();
        return AbstractC7209tN0.x("(", "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l2 + ")", " OR ", NX.i(AbstractC8235ym.p("(upload_type != 1 AND ABS(creation_timestamp - ", jCurrentTimeMillis, ") > "), ((Long) IB1.N.a(null)).longValue(), ")"), ")");
    }

    public final long j2(String str) {
        long jG1;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        v1();
        z1();
        SQLiteDatabase sQLiteDatabaseC1 = C1();
        sQLiteDatabaseC1.beginTransaction();
        long j2 = 0;
        try {
            try {
                jG1 = G1("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jG1 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseC1.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        n().g.b(OL1.B1(str), "first_open_count", "Failed to insert column (got -1). appId");
                        return -1L;
                    }
                    jG1 = 0;
                }
            } catch (SQLiteException e) {
                e = e;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + jG1));
                if (sQLiteDatabaseC1.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    n().g.b(OL1.B1(str), "first_open_count", "Failed to update column (got 0). appId");
                    return -1L;
                }
                sQLiteDatabaseC1.setTransactionSuccessful();
                return jG1;
            } catch (SQLiteException e2) {
                long j3 = jG1;
                e = e2;
                j2 = j3;
                n().g.e("Error inserting column. appId", OL1.B1(str), "first_open_count", e);
                sQLiteDatabaseC1.endTransaction();
                return j2;
            }
        } finally {
            sQLiteDatabaseC1.endTransaction();
        }
    }

    public final long k2(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = C1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                n().g.b(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l2(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.v1()
            r3.z1()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.C1()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 != 0) goto L33
            OL1 r5 = r3.n()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            rx r5 = r5.o     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.d(r1)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r0
        L2e:
            r5 = move-exception
            r0 = r4
            goto L51
        L31:
            r5 = move-exception
            goto L40
        L33:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r5
        L3c:
            r5 = move-exception
            goto L51
        L3e:
            r5 = move-exception
            r4 = r0
        L40:
            OL1 r1 = r3.n()     // Catch: java.lang.Throwable -> L2e
            rx r1 = r1.g     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Error selecting expired configs"
            r1.c(r5, r2)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L50
            r4.close()
        L50:
            return r0
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.l2(long):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00a1, code lost:
    
        n().g.c(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List n2(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.n2(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void o2(Long l2) {
        v1();
        z1();
        Preconditions.checkNotNull(l2);
        if (((C3386dP1) this.b).g.E1(null, IB1.I0) && h2()) {
            if (k2("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l2 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                n().j.d("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                C1().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l2 + " AND retry_count < 2147483647");
            } catch (SQLiteException e) {
                n().g.c(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void p2(String str, ArrayList arrayList) {
        Preconditions.checkNotEmpty(str);
        z1();
        v1();
        SQLiteDatabase sQLiteDatabaseC1 = C1();
        try {
            long jK2 = k2("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, ((C3386dP1) this.b).g.z1(str, IB1.Q)));
            if (jK2 <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Integer num = (Integer) arrayList.get(i2);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseC1.delete("audience_filter_values", AbstractC8235ym.k("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", AbstractC8235ym.k("(", TextUtils.join(StringUtils.COMMA, arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e) {
            n().g.b(OL1.B1(str), e, "Database error querying filters. appId");
        }
    }

    public final void q2(String str, XQ1 xq1) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(xq1);
        v1();
        z1();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", xq1.l());
        contentValues.put("consent_source", Integer.valueOf(xq1.b));
        Q1(contentValues);
    }

    public final long r2(String str) {
        Preconditions.checkNotEmpty(str);
        return G1("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0406Ey1 s2(java.lang.String r28, java.lang.String r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.s2(java.lang.String, java.lang.String):Ey1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0135  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C6411pB1 t2(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.t2(java.lang.String, java.lang.String, java.lang.String):pB1");
    }

    /* JADX WARN: Removed duplicated region for block: B:289:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0281 A[Catch: all -> 0x00ad, SQLiteException -> 0x00b2, TRY_LEAVE, TryCatch #8 {all -> 0x00ad, blocks: (B:229:0x0085, B:233:0x008f, B:235:0x0098, B:237:0x00a5, B:242:0x00b6, B:244:0x00ca, B:245:0x00d2, B:247:0x0114, B:252:0x011e, B:256:0x0168, B:258:0x0197, B:269:0x01b9, B:273:0x01cf, B:275:0x01da, B:276:0x01ec, B:278:0x01f6, B:284:0x0218, B:286:0x021e, B:296:0x023f, B:303:0x0264, B:305:0x0281, B:312:0x029f, B:315:0x02aa, B:317:0x02b2, B:327:0x02d3, B:337:0x0300, B:347:0x033d, B:349:0x0343, B:355:0x0367, B:357:0x036d, B:363:0x0391, B:369:0x03ab, B:371:0x03b5, B:373:0x03bd, B:383:0x03e4, B:385:0x03ea, B:340:0x031b, B:330:0x02db, B:334:0x02e4, B:272:0x01cb, B:255:0x0163, B:410:0x041e), top: B:433:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x02aa A[Catch: all -> 0x00ad, SQLiteException -> 0x00b2, TryCatch #8 {all -> 0x00ad, blocks: (B:229:0x0085, B:233:0x008f, B:235:0x0098, B:237:0x00a5, B:242:0x00b6, B:244:0x00ca, B:245:0x00d2, B:247:0x0114, B:252:0x011e, B:256:0x0168, B:258:0x0197, B:269:0x01b9, B:273:0x01cf, B:275:0x01da, B:276:0x01ec, B:278:0x01f6, B:284:0x0218, B:286:0x021e, B:296:0x023f, B:303:0x0264, B:305:0x0281, B:312:0x029f, B:315:0x02aa, B:317:0x02b2, B:327:0x02d3, B:337:0x0300, B:347:0x033d, B:349:0x0343, B:355:0x0367, B:357:0x036d, B:363:0x0391, B:369:0x03ab, B:371:0x03b5, B:373:0x03bd, B:383:0x03e4, B:385:0x03ea, B:340:0x031b, B:330:0x02db, B:334:0x02e4, B:272:0x01cb, B:255:0x0163, B:410:0x041e), top: B:433:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x02db A[Catch: all -> 0x00ad, SQLiteException -> 0x00b2, TryCatch #8 {all -> 0x00ad, blocks: (B:229:0x0085, B:233:0x008f, B:235:0x0098, B:237:0x00a5, B:242:0x00b6, B:244:0x00ca, B:245:0x00d2, B:247:0x0114, B:252:0x011e, B:256:0x0168, B:258:0x0197, B:269:0x01b9, B:273:0x01cf, B:275:0x01da, B:276:0x01ec, B:278:0x01f6, B:284:0x0218, B:286:0x021e, B:296:0x023f, B:303:0x0264, B:305:0x0281, B:312:0x029f, B:315:0x02aa, B:317:0x02b2, B:327:0x02d3, B:337:0x0300, B:347:0x033d, B:349:0x0343, B:355:0x0367, B:357:0x036d, B:363:0x0391, B:369:0x03ab, B:371:0x03b5, B:373:0x03bd, B:383:0x03e4, B:385:0x03ea, B:340:0x031b, B:330:0x02db, B:334:0x02e4, B:272:0x01cb, B:255:0x0163, B:410:0x041e), top: B:433:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x031b A[Catch: all -> 0x00ad, SQLiteException -> 0x00b2, TRY_LEAVE, TryCatch #8 {all -> 0x00ad, blocks: (B:229:0x0085, B:233:0x008f, B:235:0x0098, B:237:0x00a5, B:242:0x00b6, B:244:0x00ca, B:245:0x00d2, B:247:0x0114, B:252:0x011e, B:256:0x0168, B:258:0x0197, B:269:0x01b9, B:273:0x01cf, B:275:0x01da, B:276:0x01ec, B:278:0x01f6, B:284:0x0218, B:286:0x021e, B:296:0x023f, B:303:0x0264, B:305:0x0281, B:312:0x029f, B:315:0x02aa, B:317:0x02b2, B:327:0x02d3, B:337:0x0300, B:347:0x033d, B:349:0x0343, B:355:0x0367, B:357:0x036d, B:363:0x0391, B:369:0x03ab, B:371:0x03b5, B:373:0x03bd, B:383:0x03e4, B:385:0x03ea, B:340:0x031b, B:330:0x02db, B:334:0x02e4, B:272:0x01cb, B:255:0x0163, B:410:0x041e), top: B:433:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0343 A[Catch: all -> 0x00ad, SQLiteException -> 0x00b2, TRY_LEAVE, TryCatch #8 {all -> 0x00ad, blocks: (B:229:0x0085, B:233:0x008f, B:235:0x0098, B:237:0x00a5, B:242:0x00b6, B:244:0x00ca, B:245:0x00d2, B:247:0x0114, B:252:0x011e, B:256:0x0168, B:258:0x0197, B:269:0x01b9, B:273:0x01cf, B:275:0x01da, B:276:0x01ec, B:278:0x01f6, B:284:0x0218, B:286:0x021e, B:296:0x023f, B:303:0x0264, B:305:0x0281, B:312:0x029f, B:315:0x02aa, B:317:0x02b2, B:327:0x02d3, B:337:0x0300, B:347:0x033d, B:349:0x0343, B:355:0x0367, B:357:0x036d, B:363:0x0391, B:369:0x03ab, B:371:0x03b5, B:373:0x03bd, B:383:0x03e4, B:385:0x03ea, B:340:0x031b, B:330:0x02db, B:334:0x02e4, B:272:0x01cb, B:255:0x0163, B:410:0x041e), top: B:433:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x036d A[Catch: all -> 0x00ad, SQLiteException -> 0x00b2, TRY_LEAVE, TryCatch #8 {all -> 0x00ad, blocks: (B:229:0x0085, B:233:0x008f, B:235:0x0098, B:237:0x00a5, B:242:0x00b6, B:244:0x00ca, B:245:0x00d2, B:247:0x0114, B:252:0x011e, B:256:0x0168, B:258:0x0197, B:269:0x01b9, B:273:0x01cf, B:275:0x01da, B:276:0x01ec, B:278:0x01f6, B:284:0x0218, B:286:0x021e, B:296:0x023f, B:303:0x0264, B:305:0x0281, B:312:0x029f, B:315:0x02aa, B:317:0x02b2, B:327:0x02d3, B:337:0x0300, B:347:0x033d, B:349:0x0343, B:355:0x0367, B:357:0x036d, B:363:0x0391, B:369:0x03ab, B:371:0x03b5, B:373:0x03bd, B:383:0x03e4, B:385:0x03ea, B:340:0x031b, B:330:0x02db, B:334:0x02e4, B:272:0x01cb, B:255:0x0163, B:410:0x041e), top: B:433:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x03ea A[Catch: all -> 0x00ad, SQLiteException -> 0x00b2, TRY_LEAVE, TryCatch #8 {all -> 0x00ad, blocks: (B:229:0x0085, B:233:0x008f, B:235:0x0098, B:237:0x00a5, B:242:0x00b6, B:244:0x00ca, B:245:0x00d2, B:247:0x0114, B:252:0x011e, B:256:0x0168, B:258:0x0197, B:269:0x01b9, B:273:0x01cf, B:275:0x01da, B:276:0x01ec, B:278:0x01f6, B:284:0x0218, B:286:0x021e, B:296:0x023f, B:303:0x0264, B:305:0x0281, B:312:0x029f, B:315:0x02aa, B:317:0x02b2, B:327:0x02d3, B:337:0x0300, B:347:0x033d, B:349:0x0343, B:355:0x0367, B:357:0x036d, B:363:0x0391, B:369:0x03ab, B:371:0x03b5, B:373:0x03bd, B:383:0x03e4, B:385:0x03ea, B:340:0x031b, B:330:0x02db, B:334:0x02e4, B:272:0x01cb, B:255:0x0163, B:410:0x041e), top: B:433:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x03da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:449:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.PM1 u2(java.lang.String r54) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.u2(java.lang.String):PM1");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C6483pZ1 v2(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r10.v1()
            r10.z1()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.C1()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            r8 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r2 = 1
            java.lang.Object r9 = r10.I1(r1, r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            pZ1 r2 = new pZ1     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r3 == 0) goto L6c
            OL1 r3 = r10.n()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            rx r3 = r3.g     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            iM1 r5 = defpackage.OL1.B1(r11)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r3.c(r5, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6c
        L67:
            r11 = move-exception
            r0 = r1
            goto L93
        L6a:
            r2 = move-exception
            goto L74
        L6c:
            r1.close()
            return r2
        L70:
            r11 = move-exception
            goto L93
        L72:
            r2 = move-exception
            r1 = r0
        L74:
            OL1 r3 = r10.n()     // Catch: java.lang.Throwable -> L67
            rx r3 = r3.g     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "Error querying user property. appId"
            iM1 r11 = defpackage.OL1.B1(r11)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r5 = r10.b     // Catch: java.lang.Throwable -> L67
            dP1 r5 = (defpackage.C3386dP1) r5     // Catch: java.lang.Throwable -> L67
            EL1 r5 = r5.m     // Catch: java.lang.Throwable -> L67
            java.lang.String r12 = r5.g(r12)     // Catch: java.lang.Throwable -> L67
            r3.e(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L92
            r1.close()
        L92:
            return r0
        L93:
            if (r0 == 0) goto L98
            r0.close()
        L98:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.v2(java.lang.String, java.lang.String):pZ1");
    }

    public final Map w2(String str, String str2) throws Throwable {
        z1();
        v1();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        C7925x8 c7925x8 = new C7925x8();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = C1().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        Map mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        return mapEmptyMap;
                    }
                    do {
                        try {
                            C6816rJ1 c6816rJ1 = (C6816rJ1) ((C6626qJ1) C2540cZ1.P1(C6816rJ1.r(), cursorQuery.getBlob(1))).e();
                            int i2 = cursorQuery.getInt(0);
                            List arrayList = (List) c7925x8.getOrDefault(Integer.valueOf(i2), null);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c7925x8.put(Integer.valueOf(i2), arrayList);
                            }
                            arrayList.add(c6816rJ1);
                        } catch (IOException e) {
                            n().g.b(OL1.B1(str), e, "Failed to merge filter. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    return c7925x8;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = cursorQuery;
                    n().g.b(OL1.B1(str), e, "Database error querying filters. appId");
                    Map mapEmptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return mapEmptyMap2;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Map x2(String str, String str2) throws Throwable {
        z1();
        v1();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        C7925x8 c7925x8 = new C7925x8();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = C1().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        Map mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        return mapEmptyMap;
                    }
                    do {
                        try {
                            C7960xJ1 c7960xJ1 = (C7960xJ1) ((C7770wJ1) C2540cZ1.P1(C7960xJ1.p(), cursorQuery.getBlob(1))).e();
                            int i2 = cursorQuery.getInt(0);
                            List arrayList = (List) c7925x8.getOrDefault(Integer.valueOf(i2), null);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c7925x8.put(Integer.valueOf(i2), arrayList);
                            }
                            arrayList.add(c7960xJ1);
                        } catch (IOException e) {
                            n().g.b(OL1.B1(str), e, "Failed to merge filter");
                        }
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    return c7925x8;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = cursorQuery;
                    n().g.b(OL1.B1(str), e, "Database error querying filters. appId");
                    Map mapEmptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return mapEmptyMap2;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final XQ1 y2(String str) {
        Preconditions.checkNotNull(str);
        v1();
        z1();
        return XQ1.d(100, J1("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.XQ1 z2(java.lang.String r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r4.v1()
            r4.z1()
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.C1()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            if (r0 != 0) goto L32
            OL1 r0 = r4.n()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            rx r0 = r0.o     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            java.lang.String r2 = "No data found"
            r0.d(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r5.close()
            goto L58
        L2d:
            r0 = move-exception
            r1 = r5
            goto L5e
        L30:
            r0 = move-exception
            goto L48
        L32:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            XQ1 r1 = defpackage.XQ1.d(r2, r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r5.close()
            goto L58
        L44:
            r0 = move-exception
            goto L5e
        L46:
            r0 = move-exception
            r5 = r1
        L48:
            OL1 r2 = r4.n()     // Catch: java.lang.Throwable -> L2d
            rx r2 = r2.g     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Error querying database."
            r2.c(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L58
            r5.close()
        L58:
            if (r1 != 0) goto L5d
            XQ1 r5 = defpackage.XQ1.c
            return r5
        L5d:
            return r1
        L5e:
            if (r1 == 0) goto L63
            r1.close()
        L63:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1656Uz1.z2(java.lang.String):XQ1");
    }
}
