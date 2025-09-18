package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
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
public final class C8405Uz1 extends AbstractC9512gY1 {

    /* renamed from: g */
    public static final String[] f12275g = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: h */
    public static final String[] f12276h = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;"};

    /* renamed from: i */
    public static final String[] f12277i = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: j */
    public static final String[] f12278j = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", LocalNotification.Repeat.Type.DAY, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};

    /* renamed from: k */
    public static final String[] f12279k = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: l */
    public static final String[] f12280l = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: m */
    public static final String[] f12281m = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n */
    public static final String[] f12282n = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: o */
    public static final String[] f12283o = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: p */
    public static final String[] f12284p = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: q */
    public static final String[] f12285q = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: e */
    public final AA1 f12286e;

    /* renamed from: f */
    public final C0495Hr f12287f;

    public C8405Uz1(C10152lY1 c10152lY1) {
        super(c10152lY1);
        this.f12287f = new C0495Hr(((C9110dP1) this.f11615b).f26044n);
        this.f12286e = new AA1(this, ((C9110dP1) this.f11615b).f26031a);
    }

    /* renamed from: R1 */
    public static void m8208R1(ContentValues contentValues, Object obj) {
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

    /* renamed from: m2 */
    public static String m8209m2(ArrayList arrayList) {
        return arrayList.isEmpty() ? "" : AbstractC7222ym.m26234k(" AND (upload_type IN (", TextUtils.join(", ", arrayList), "))");
    }

    /* renamed from: A2 */
    public final void m8210A2(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo7681v1();
        m18576z1();
        try {
            m8212C1().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8378g.m24556e("Error deleting user property. appId", OL1.m6026B1(str), ((C9110dP1) this.f11615b).f26043m.m2167g(str2), e);
        }
    }

    @Override // p000.AbstractC9512gY1
    /* renamed from: B1 */
    public final boolean mo1721B1() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* renamed from: B2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.ZY1 m8211B2(java.lang.String r25) throws java.lang.Throwable {
        /*
            r24 = this;
            r12 = r24
            r13 = r25
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r25)
            r24.mo7681v1()
            r24.m18576z1()
            java.lang.Object r0 = r12.f11615b
            dP1 r0 = (p000.C9110dP1) r0
            Py1 r1 = r0.f26037g
            GJ1 r2 = p000.IB1.f4745I0
            r14 = 0
            boolean r1 = r1.m6511E1(r14, r2)
            if (r1 != 0) goto L1d
            return r14
        L1d:
            GJ1 r1 = p000.IB1.f4749K0
            Py1 r0 = r0.f26037g
            boolean r0 = r0.m6511E1(r14, r1)
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L44
            int[] r0 = new int[]{r1}
            VX1 r0 = p000.VX1.m8460i0(r0)
            r1 = 1
            java.util.List r0 = r12.m8230L1(r13, r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3d
            return r14
        L3d:
            java.lang.Object r0 = r0.get(r2)
            ZY1 r0 = (p000.ZY1) r0
            return r0
        L44:
            android.database.sqlite.SQLiteDatabase r3 = r24.m8212C1()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
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
            java.lang.String r0 = r24.m8253i2()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
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
            ZY1 r0 = r1.m8235P1(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbf
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
            OL1 r1 = r24.mo6070n()     // Catch: java.lang.Throwable -> Lbc
            rx r1 = r1.f8378g     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = "Error to querying MeasurementBatch from upload_queue. appId"
            r1.m24553b(r13, r0, r2)     // Catch: java.lang.Throwable -> Lbc
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8211B2(java.lang.String):ZY1");
    }

    /* renamed from: C1 */
    public final SQLiteDatabase m8212C1() {
        mo7681v1();
        try {
            return this.f12286e.getWritableDatabase();
        } catch (SQLiteException e) {
            mo6070n().f8381j.m24554c(e, "Error opening database");
            throw e;
        }
    }

    /* renamed from: C2 */
    public final boolean m8213C2(String str, String str2) {
        return m8255k2("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /* renamed from: D1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m8214D1() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m8212C1()
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
            OL1 r3 = r6.mo6070n()     // Catch: java.lang.Throwable -> L1a
            rx r3 = r3.f8378g     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m24554c(r2, r4)     // Catch: java.lang.Throwable -> L1a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8214D1():java.lang.String");
    }

    /* renamed from: D2 */
    public final void m8215D2(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        mo7681v1();
        m18576z1();
        try {
            m8212C1().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8378g.m24553b(OL1.m6026B1(str2), e, "Error deleting snapshot. appId");
        }
    }

    /* renamed from: E1 */
    public final long m8216E1(String str) {
        Preconditions.checkNotEmpty(str);
        mo7681v1();
        m18576z1();
        try {
            return m8212C1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, ((C9110dP1) this.f11615b).f26037g.m6518z1(str, IB1.f4818q))))});
        } catch (SQLiteException e) {
            mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Error deleting over the limit events. appId");
            return 0L;
        }
    }

    /* renamed from: E2 */
    public final List m8217E2(String str) {
        Preconditions.checkNotEmpty(str);
        mo7681v1();
        m18576z1();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m8212C1().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
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
                    long j = cursorQuery.getLong(2);
                    Object objM8224I1 = m8224I1(cursorQuery, 3);
                    if (objM8224I1 == null) {
                        mo6070n().f8378g.m24554c(OL1.m6026B1(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new C10666pZ1(str, str2, string, j, objM8224I1));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Error querying user properties. appId");
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

    /* renamed from: F1 */
    public final long m8218F1(String str, QK1 qk1, String str2, Map map, int i, Long l) {
        int iDelete;
        mo7681v1();
        m18576z1();
        Preconditions.checkNotNull(qk1);
        Preconditions.checkNotEmpty(str);
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (!c9110dP1.f26037g.m6511E1(null, IB1.f4745I0)) {
            return -1L;
        }
        mo7681v1();
        m18576z1();
        boolean zM8252h2 = m8252h2();
        Clock clock = c9110dP1.f26044n;
        if (zM8252h2) {
            C10152lY1 c10152lY1 = this.f5586c;
            long jM18962g = c10152lY1.f37131i.f2033g.m18962g();
            long jElapsedRealtime = clock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM18962g) > ((Long) IB1.f4744I.m3028a(null)).longValue()) {
                c10152lY1.f37131i.f2033g.m18963h(jElapsedRealtime);
                mo7681v1();
                m18576z1();
                if (m8252h2() && (iDelete = m8212C1().delete("upload_queue", m8253i2(), new String[0])) > 0) {
                    mo6070n().f8386o.m24554c(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                GJ1 gj1 = IB1.f4749K0;
                C8143Py1 c8143Py1 = c9110dP1.f26037g;
                if (c8143Py1.m6511E1(null, gj1)) {
                    Preconditions.checkNotEmpty(str);
                    mo7681v1();
                    m18576z1();
                    try {
                        int iM6518z1 = c8143Py1.m6518z1(str, IB1.f4830w);
                        if (iM6518z1 > 0) {
                            m8212C1().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM6518z1)});
                        }
                    } catch (SQLiteException e) {
                        mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Error deleting over the limit queued batches. appId");
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((String) entry.getValue()));
        }
        byte[] bArrM3857c = qk1.m3857c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrM3857c);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i2 = 1;
            while (i2 < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i2);
                i2++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(RI1.m6942f(i)));
        contentValues.put("creation_timestamp", Long.valueOf(clock.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = m8212C1().insert("upload_queue", null, contentValues);
            if (jInsert == -1) {
                mo6070n().f8378g.m24554c(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            }
            return jInsert;
        } catch (SQLiteException e2) {
            mo6070n().f8378g.m24553b(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* renamed from: F2 */
    public final void m8219F2(String str) {
        C10618pB1 c10618pB1M8263t2;
        m8215D2("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m8212C1().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (c10618pB1M8263t2 = m8263t2("events", str, string)) != null) {
                        m8241W1("events_snapshot", c10618pB1M8263t2);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e) {
                mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Error creating snapshot. appId");
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

    /* renamed from: G1 */
    public final long m8220G1(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m8212C1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j;
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                mo6070n().f8378g.m24553b(str, e, "Database error");
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
    /* renamed from: G2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8221G2(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8221G2(java.lang.String):void");
    }

    /* renamed from: H1 */
    public final long m8222H1(SK1 sk1) {
        mo7681v1();
        m18576z1();
        Preconditions.checkNotNull(sk1);
        Preconditions.checkNotEmpty(sk1.m7286D());
        byte[] bArrM3857c = sk1.m3857c();
        long jM10775D1 = m4343w1().m10775D1(bArrM3857c);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", sk1.m7286D());
        contentValues.put("metadata_fingerprint", Long.valueOf(jM10775D1));
        contentValues.put("metadata", bArrM3857c);
        try {
            m8212C1().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jM10775D1;
        } catch (SQLiteException e) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8378g.m24553b(OL1.m6026B1(sk1.m7286D()), e, "Error storing raw event metadata. appId");
            throw e;
        }
    }

    /* renamed from: H2 */
    public final void m8223H2() {
        m18576z1();
        m8212C1().beginTransaction();
    }

    /* renamed from: I1 */
    public final Object m8224I1(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo6070n().f8378g.m24555d("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type == 4) {
            mo6070n().f8378g.m24555d("Loaded invalid blob type value, ignoring it");
            return null;
        }
        OL1 ol1Mo6070n = mo6070n();
        ol1Mo6070n.f8378g.m24554c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    /* renamed from: I2 */
    public final boolean m8225I2(String str) {
        C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
        if (!c9110dP1.f26037g.m6511E1(null, IB1.f4745I0)) {
            return false;
        }
        if (!c9110dP1.f26037g.m6511E1(null, IB1.f4749K0)) {
            return m8255k2(AbstractC7222ym.m26245v("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ", m8253i2()), new String[]{str}) != 0;
        }
        int[] iArr = {2};
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i <= 0; i++) {
            arrayList.add(Integer.valueOf(RI1.m6942f(iArr[0])));
        }
        return m8255k2(AbstractC1374Vq.m8590i("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", m8209m2(arrayList), " AND NOT ", m8253i2()), new String[]{str}) != 0;
    }

    /* renamed from: J1 */
    public final String m8226J1(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m8212C1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                mo6070n().f8378g.m24553b(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: J2 */
    public final void m8227J2() {
        m18576z1();
        m8212C1().endTransaction();
    }

    /* renamed from: K1 */
    public final List m8228K1(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        mo7681v1();
        m18576z1();
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
        return m8232M1(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: K2 */
    public final void m8229K2() {
        int iDelete;
        mo7681v1();
        m18576z1();
        if (m8252h2()) {
            C10152lY1 c10152lY1 = this.f5586c;
            long jM18962g = c10152lY1.f37131i.f2032f.m18962g();
            C9110dP1 c9110dP1 = (C9110dP1) this.f11615b;
            long jElapsedRealtime = c9110dP1.f26044n.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM18962g) > ((Long) IB1.f4744I.m3028a(null)).longValue()) {
                c10152lY1.f37131i.f2032f.m18963h(jElapsedRealtime);
                mo7681v1();
                m18576z1();
                if (!m8252h2() || (iDelete = m8212C1().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(c9110dP1.f26044n.currentTimeMillis()), String.valueOf(((Long) IB1.f4754N.m3028a(null)).longValue())})) <= 0) {
                    return;
                }
                mo6070n().f8386o.m24554c(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
            }
        }
    }

    /* renamed from: L1 */
    public final List m8230L1(String str, VX1 vx1, int i) throws Throwable {
        Cursor cursor = null;
        if (!((C9110dP1) this.f11615b).f26037g.m6511E1(null, IB1.f4749K0)) {
            return Collections.emptyList();
        }
        Preconditions.checkNotEmpty(str);
        mo7681v1();
        m18576z1();
        try {
            try {
                Cursor cursorQuery = m8212C1().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id"}, "app_id=?" + m8209m2(vx1.f12609a) + " AND NOT " + m8253i2(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorQuery.moveToNext()) {
                        long j = cursorQuery.getLong(0);
                        byte[] blob = cursorQuery.getBlob(2);
                        String string = cursorQuery.getString(3);
                        String string2 = cursorQuery.getString(4);
                        int i2 = cursorQuery.getInt(5);
                        int i3 = cursorQuery.getInt(6);
                        cursorQuery.getLong(7);
                        ZY1 zy1M8235P1 = m8235P1(str, j, blob, string, string2, i2, i3, cursorQuery.getLong(8));
                        if (zy1M8235P1 != null) {
                            arrayList.add(zy1M8235P1);
                        }
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = cursorQuery;
                    mo6070n().f8378g.m24553b(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
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

    /* renamed from: L2 */
    public final void m8231L2() {
        m18576z1();
        m8212C1().setTransactionSuccessful();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0050, code lost:
    
        mo6070n().f8378g.m24554c(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* renamed from: M1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m8232M1(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8232M1(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: N1 */
    public final C8691aA1 m8233N1(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Preconditions.checkNotEmpty(str);
        mo7681v1();
        m18576z1();
        String[] strArr = {str};
        C8691aA1 c8691aA1 = new C8691aA1();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM8212C1 = m8212C1();
                Cursor cursorQuery = sQLiteDatabaseM8212C1.query("apps", new String[]{LocalNotification.Repeat.Type.DAY, "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    mo6070n().f8381j.m24554c(OL1.m6026B1(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return c8691aA1;
                }
                if (cursorQuery.getLong(0) == j) {
                    c8691aA1.f15372b = cursorQuery.getLong(1);
                    c8691aA1.f15371a = cursorQuery.getLong(2);
                    c8691aA1.f15373c = cursorQuery.getLong(3);
                    c8691aA1.f15374d = cursorQuery.getLong(4);
                    c8691aA1.f15375e = cursorQuery.getLong(5);
                    c8691aA1.f15376f = cursorQuery.getLong(6);
                    c8691aA1.f15377g = cursorQuery.getLong(7);
                }
                if (z) {
                    c8691aA1.f15372b += j2;
                }
                if (z2) {
                    c8691aA1.f15371a += j2;
                }
                if (z3) {
                    c8691aA1.f15373c += j2;
                }
                if (z4) {
                    c8691aA1.f15374d += j2;
                }
                if (z5) {
                    c8691aA1.f15375e += j2;
                }
                if (z6) {
                    c8691aA1.f15376f += j2;
                }
                if (z7) {
                    c8691aA1.f15377g += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put(LocalNotification.Repeat.Type.DAY, Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(c8691aA1.f15371a));
                contentValues.put("daily_events_count", Long.valueOf(c8691aA1.f15372b));
                contentValues.put("daily_conversions_count", Long.valueOf(c8691aA1.f15373c));
                contentValues.put("daily_error_events_count", Long.valueOf(c8691aA1.f15374d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c8691aA1.f15375e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c8691aA1.f15376f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(c8691aA1.f15377g));
                sQLiteDatabaseM8212C1.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c8691aA1;
            } catch (SQLiteException e) {
                mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Error updating daily counts. appId");
                if (0 != 0) {
                    cursor.close();
                }
                return c8691aA1;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: O1 */
    public final C8691aA1 m8234O1(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return m8233N1(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    /* renamed from: P1 */
    public final ZY1 m8235P1(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2) {
        if (TextUtils.isEmpty(str2)) {
            mo6070n().f8385n.m24555d("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            PK1 pk1 = (PK1) C8997cZ1.m10763P1(QK1.m6655v(), bArr);
            int i3 = 6;
            int[] iArrM26223C = AbstractC7222ym.m26223C(6);
            int length = iArrM26223C.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                int i5 = iArrM26223C[i4];
                if (RI1.m6942f(i5) == i) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            if (i3 != 2 && i3 != 5 && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((QK1) pk1.f39024b).m6662y()).iterator();
                while (it.hasNext()) {
                    RK1 rk1 = (RK1) ((SK1) it.next()).m24347j();
                    rk1.m23414i();
                    SK1.m7267s1((SK1) rk1.f39024b, i2);
                    arrayList.add((SK1) rk1.m23412e());
                }
                pk1.m23414i();
                QK1.m6653t((QK1) pk1.f39024b);
                pk1.m23414i();
                QK1.m6651r((QK1) pk1.f39024b, arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length2 = strArrSplit.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        break;
                    }
                    String str4 = strArrSplit[i6];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
                    if (strArrSplit2.length != 2) {
                        mo6070n().f8378g.m24554c(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i6++;
                }
            }
            QK1 qk1 = (QK1) pk1.m23412e();
            ZY1 zy1 = new ZY1();
            zy1.f14966a = j;
            zy1.f14967b = qk1;
            zy1.f14968c = str2;
            zy1.f14969d = map;
            zy1.f14970e = i3;
            zy1.f14971f = j2;
            return zy1;
        } catch (IOException e) {
            mo6070n().f8378g.m24553b(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    /* renamed from: Q1 */
    public final void m8236Q1(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseM8212C1 = m8212C1();
            if (contentValues.getAsString("app_id") == null) {
                mo6070n().f8380i.m24554c(OL1.m6026B1("app_id"), "Value of the primary key is not set.");
            } else if (sQLiteDatabaseM8212C1.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && sQLiteDatabaseM8212C1.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                mo6070n().f8378g.m24553b(OL1.m6026B1("consent_settings"), OL1.m6026B1("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            mo6070n().f8378g.m24556e("Error storing into table. key", OL1.m6026B1("consent_settings"), OL1.m6026B1("app_id"), e);
        }
    }

    /* renamed from: S1 */
    public final void m8237S1(Long l) {
        mo7681v1();
        m18576z1();
        Preconditions.checkNotNull(l);
        if (((C9110dP1) this.f11615b).f26037g.m6511E1(null, IB1.f4745I0)) {
            try {
                if (m8212C1().delete("upload_queue", "rowid=?", new String[]{String.valueOf(l)}) != 1) {
                    mo6070n().f8381j.m24555d("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e) {
                mo6070n().f8378g.m24554c(e, "Failed to delete a MeasurementBatch in a upload_queue table");
                throw e;
            }
        }
    }

    /* renamed from: T1 */
    public final void m8238T1(String str, Long l, long j, KK1 kk1) {
        mo7681v1();
        m18576z1();
        Preconditions.checkNotNull(kk1);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] bArrM3857c = kk1.m3857c();
        OL1 ol1Mo6070n = mo6070n();
        ol1Mo6070n.f8386o.m24553b(((C9110dP1) this.f11615b).f26043m.m2163b(str), Integer.valueOf(bArrM3857c.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrM3857c);
        try {
            if (m8212C1().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                mo6070n().f8378g.m24554c(OL1.m6026B1(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            OL1 ol1Mo6070n2 = mo6070n();
            ol1Mo6070n2.f8378g.m24553b(OL1.m6026B1(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0262 A[Catch: SQLiteException -> 0x0276, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0276, blocks: (B:208:0x0247, B:210:0x0262), top: B:219:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0122 A[SYNTHETIC] */
    /* renamed from: U1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8239U1(java.lang.String r26, java.lang.Long r27, java.lang.String r28, android.os.Bundle r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8239U1(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: V1 */
    public final void m8240V1(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo7681v1();
        m18576z1();
        try {
            m8212C1().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8378g.m24556e("Error deleting conditional property", OL1.m6026B1(str), ((C9110dP1) this.f11615b).f26043m.m2167g(str2), e);
        }
    }

    /* renamed from: W1 */
    public final void m8241W1(String str, C10618pB1 c10618pB1) {
        Preconditions.checkNotNull(c10618pB1);
        mo7681v1();
        m18576z1();
        ContentValues contentValues = new ContentValues();
        String str2 = c10618pB1.f39886a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c10618pB1.f39887b);
        contentValues.put("lifetime_count", Long.valueOf(c10618pB1.f39888c));
        contentValues.put("current_bundle_count", Long.valueOf(c10618pB1.f39889d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c10618pB1.f39891f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c10618pB1.f39892g));
        contentValues.put("last_bundled_day", c10618pB1.f39893h);
        contentValues.put("last_sampled_complex_event_id", c10618pB1.f39894i);
        contentValues.put("last_sampling_rate", c10618pB1.f39895j);
        contentValues.put("current_session_count", Long.valueOf(c10618pB1.f39890e));
        Boolean bool = c10618pB1.f39896k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m8212C1().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                mo6070n().f8378g.m24554c(OL1.m6026B1(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            mo6070n().f8378g.m24553b(OL1.m6026B1(str2), e, "Error storing event aggregates. appId");
        }
    }

    /* renamed from: X1 */
    public final void m8242X1(String str, XQ1 xq1) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(xq1);
        mo7681v1();
        m18576z1();
        m8260q2(str, m8269z2(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", xq1.m9051l());
        m8236Q1(contentValues);
    }

    /* renamed from: Y1 */
    public final void m8243Y1(String str, C11938zX1 c11938zX1) {
        mo7681v1();
        m18576z1();
        Preconditions.checkNotNull(c11938zX1);
        Preconditions.checkNotEmpty(str);
        long jCurrentTimeMillis = ((C9110dP1) this.f11615b).f26044n.currentTimeMillis();
        GJ1 gj1 = IB1.f4819q0;
        long jLongValue = jCurrentTimeMillis - ((Long) gj1.m3028a(null)).longValue();
        long j = c11938zX1.f46862b;
        if (j < jLongValue || j > ((Long) gj1.m3028a(null)).longValue() + jCurrentTimeMillis) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8381j.m24556e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", OL1.m6026B1(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        mo6070n().f8386o.m24555d("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c11938zX1.f46861a);
        contentValues.put("source", Integer.valueOf(c11938zX1.f46863c));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (m8212C1().insert("trigger_uris", null, contentValues) == -1) {
                mo6070n().f8378g.m24554c(OL1.m6026B1(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            OL1 ol1Mo6070n2 = mo6070n();
            ol1Mo6070n2.f8378g.m24553b(OL1.m6026B1(str), e, "Error storing trigger URI. appId");
        }
    }

    /* renamed from: Z1 */
    public final void m8244Z1(List list) throws SQLException {
        mo7681v1();
        m18576z1();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (m8252h2()) {
            String strM26234k = AbstractC7222ym.m26234k("(", TextUtils.join(StringUtils.COMMA, list), ")");
            if (m8255k2("SELECT COUNT(1) FROM queue WHERE rowid IN " + strM26234k + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                mo6070n().f8381j.m24555d("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m8212C1().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strM26234k + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                mo6070n().f8378g.m24554c(e, "Error incrementing retry count. error");
            }
        }
    }

    /* renamed from: a2 */
    public final void m8245a2(SK1 sk1, boolean z) {
        mo7681v1();
        m18576z1();
        Preconditions.checkNotNull(sk1);
        Preconditions.checkNotEmpty(sk1.m7286D());
        Preconditions.checkState(sk1.m7357v0());
        m8229K2();
        long jCurrentTimeMillis = ((C9110dP1) this.f11615b).f26044n.currentTimeMillis();
        long jM7311Q1 = sk1.m7311Q1();
        GJ1 gj1 = IB1.f4754N;
        if (jM7311Q1 < jCurrentTimeMillis - ((Long) gj1.m3028a(null)).longValue() || sk1.m7311Q1() > ((Long) gj1.m3028a(null)).longValue() + jCurrentTimeMillis) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8381j.m24556e("Storing bundle outside of the max uploading time span. appId, now, timestamp", OL1.m6026B1(sk1.m7286D()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(sk1.m7311Q1()));
        }
        try {
            byte[] bArrM10786g2 = m4343w1().m10786g2(sk1.m3857c());
            OL1 ol1Mo6070n2 = mo6070n();
            ol1Mo6070n2.f8386o.m24554c(Integer.valueOf(bArrM10786g2.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", sk1.m7286D());
            contentValues.put("bundle_end_timestamp", Long.valueOf(sk1.m7311Q1()));
            contentValues.put("data", bArrM10786g2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (sk1.m7285C0()) {
                contentValues.put("retry_count", Integer.valueOf(sk1.m7343l1()));
            }
            try {
                if (m8212C1().insert("queue", null, contentValues) == -1) {
                    mo6070n().f8378g.m24554c(OL1.m6026B1(sk1.m7286D()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                OL1 ol1Mo6070n3 = mo6070n();
                ol1Mo6070n3.f8378g.m24553b(OL1.m6026B1(sk1.m7286D()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            OL1 ol1Mo6070n4 = mo6070n();
            ol1Mo6070n4.f8378g.m24553b(OL1.m6026B1(sk1.m7286D()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    /* renamed from: b2 */
    public final void m8246b2(PM1 pm1, boolean z) {
        Preconditions.checkNotNull(pm1);
        mo7681v1();
        m18576z1();
        String strM6334f = pm1.m6334f();
        Preconditions.checkNotNull(strM6334f);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strM6334f);
        TQ1 tq1 = TQ1.ANALYTICS_STORAGE;
        C10152lY1 c10152lY1 = this.f5586c;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (c10152lY1.m22461J(strM6334f).m9048i(tq1)) {
            contentValues.put("app_instance_id", pm1.m6335g());
        }
        contentValues.put("gmp_app_id", pm1.m6338j());
        boolean zM9048i = c10152lY1.m22461J(strM6334f).m9048i(TQ1.AD_STORAGE);
        C9110dP1 c9110dP1 = pm1.f9033a;
        if (zM9048i) {
            C11412vO1 c11412vO1 = c9110dP1.f26040j;
            C9110dP1.m17592e(c11412vO1);
            c11412vO1.mo7681v1();
            contentValues.put("resettable_device_id_hash", pm1.f9037e);
        }
        C11412vO1 c11412vO12 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO12);
        c11412vO12.mo7681v1();
        contentValues.put("last_bundle_index", Long.valueOf(pm1.f9039g));
        C11412vO1 c11412vO13 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO13);
        c11412vO13.mo7681v1();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(pm1.f9040h));
        C11412vO1 c11412vO14 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO14);
        c11412vO14.mo7681v1();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(pm1.f9041i));
        contentValues.put("app_version", pm1.m6336h());
        C11412vO1 c11412vO15 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO15);
        c11412vO15.mo7681v1();
        contentValues.put("app_store", pm1.f9044l);
        C11412vO1 c11412vO16 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO16);
        c11412vO16.mo7681v1();
        contentValues.put("gmp_version", Long.valueOf(pm1.f9045m));
        C11412vO1 c11412vO17 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO17);
        c11412vO17.mo7681v1();
        contentValues.put("dev_cert_hash", Long.valueOf(pm1.f9046n));
        C11412vO1 c11412vO18 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO18);
        c11412vO18.mo7681v1();
        contentValues.put("measurement_enabled", Boolean.valueOf(pm1.f9047o));
        C11412vO1 c11412vO19 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO19);
        c11412vO19.mo7681v1();
        contentValues.put(LocalNotification.Repeat.Type.DAY, Long.valueOf(pm1.f9023K));
        C11412vO1 c11412vO110 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO110);
        c11412vO110.mo7681v1();
        contentValues.put("daily_public_events_count", Long.valueOf(pm1.f9024L));
        C9110dP1.m17592e(c11412vO110);
        c11412vO110.mo7681v1();
        contentValues.put("daily_events_count", Long.valueOf(pm1.f9025M));
        C9110dP1.m17592e(c11412vO110);
        c11412vO110.mo7681v1();
        contentValues.put("daily_conversions_count", Long.valueOf(pm1.f9026N));
        C11412vO1 c11412vO111 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO111);
        c11412vO111.mo7681v1();
        contentValues.put("config_fetched_time", Long.valueOf(pm1.f9031S));
        C11412vO1 c11412vO112 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO112);
        c11412vO112.mo7681v1();
        contentValues.put("failed_config_fetch_time", Long.valueOf(pm1.f9032T));
        contentValues.put("app_version_int", Long.valueOf(pm1.m6353y()));
        contentValues.put("firebase_instance_id", pm1.m6337i());
        C9110dP1.m17592e(c11412vO110);
        c11412vO110.mo7681v1();
        contentValues.put("daily_error_events_count", Long.valueOf(pm1.f9027O));
        C9110dP1.m17592e(c11412vO110);
        c11412vO110.mo7681v1();
        contentValues.put("daily_realtime_events_count", Long.valueOf(pm1.f9028P));
        C9110dP1.m17592e(c11412vO110);
        c11412vO110.mo7681v1();
        contentValues.put("health_monitor_sample", pm1.f9029Q);
        contentValues.put("android_id", (Long) 0L);
        C11412vO1 c11412vO113 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO113);
        c11412vO113.mo7681v1();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(pm1.f9048p));
        contentValues.put("admob_app_id", pm1.m6332d());
        contentValues.put("dynamite_version", Long.valueOf(pm1.m6321N()));
        if (c10152lY1.m22461J(strM6334f).m9048i(tq1)) {
            C11412vO1 c11412vO114 = c9110dP1.f26040j;
            C9110dP1.m17592e(c11412vO114);
            c11412vO114.mo7681v1();
            contentValues.put("session_stitching_token", pm1.f9053u);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(pm1.m6342n()));
        C11412vO1 c11412vO115 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO115);
        c11412vO115.mo7681v1();
        contentValues.put("target_os_version", Long.valueOf(pm1.f9055w));
        C11412vO1 c11412vO116 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO116);
        c11412vO116.mo7681v1();
        contentValues.put("session_stitching_token_hash", Long.valueOf(pm1.f9056x));
        C11304uY1.m25207a();
        C9110dP1 c9110dP12 = (C9110dP1) this.f11615b;
        if (c9110dP12.f26037g.m6511E1(strM6334f, IB1.f4761Q0)) {
            C11412vO1 c11412vO117 = c9110dP1.f26040j;
            C9110dP1.m17592e(c11412vO117);
            c11412vO117.mo7681v1();
            contentValues.put("ad_services_version", Integer.valueOf(pm1.f9057y));
            C11412vO1 c11412vO118 = c9110dP1.f26040j;
            C9110dP1.m17592e(c11412vO118);
            c11412vO118.mo7681v1();
            contentValues.put("attribution_eligibility_status", Long.valueOf(pm1.f9015C));
        }
        C11412vO1 c11412vO119 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO119);
        c11412vO119.mo7681v1();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(pm1.f9058z));
        contentValues.put("npa_metadata_value", pm1.m6328U());
        C11412vO1 c11412vO120 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO120);
        c11412vO120.mo7681v1();
        contentValues.put("bundle_delivery_index", Long.valueOf(pm1.f9019G));
        contentValues.put("sgtm_preview_key", pm1.m6340l());
        C9110dP1.m17592e(c11412vO110);
        c11412vO110.mo7681v1();
        contentValues.put("dma_consent_state", Integer.valueOf(pm1.f9017E));
        C9110dP1.m17592e(c11412vO110);
        c11412vO110.mo7681v1();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(pm1.f9018F));
        contentValues.put("serialized_npa_metadata", pm1.m6339k());
        GJ1 gj1 = IB1.f4749K0;
        C8143Py1 c8143Py1 = c9110dP12.f26037g;
        if (c8143Py1.m6511E1(strM6334f, gj1)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(pm1.m6343o()));
        }
        C11412vO1 c11412vO121 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO121);
        c11412vO121.mo7681v1();
        ArrayList arrayList = pm1.f9052t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                mo6070n().f8381j.m24554c(strM6334f, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(StringUtils.COMMA, arrayList));
            }
        }
        AX1.f237b.get();
        if (c8143Py1.m6511E1(null, IB1.f4739F0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C11412vO1 c11412vO122 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO122);
        c11412vO122.mo7681v1();
        contentValues.put("unmatched_pfo", pm1.f9013A);
        C11412vO1 c11412vO123 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO123);
        c11412vO123.mo7681v1();
        contentValues.put("unmatched_uwa", pm1.f9014B);
        C11412vO1 c11412vO124 = c9110dP1.f26040j;
        C9110dP1.m17592e(c11412vO124);
        c11412vO124.mo7681v1();
        contentValues.put("ad_campaign_info", pm1.f9021I);
        try {
            SQLiteDatabase sQLiteDatabaseM8212C1 = m8212C1();
            if (sQLiteDatabaseM8212C1.update("apps", contentValues, "app_id = ?", new String[]{strM6334f}) == 0 && sQLiteDatabaseM8212C1.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo6070n().f8378g.m24554c(OL1.m6026B1(strM6334f), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            mo6070n().f8378g.m24553b(OL1.m6026B1(strM6334f), e, "Error storing app. appId");
        }
    }

    /* renamed from: c2 */
    public final boolean m8247c2(C1588ZE c1588ze, long j, boolean z) {
        mo7681v1();
        m18576z1();
        Preconditions.checkNotNull(c1588ze);
        String str = (String) c1588ze.f14807d;
        Preconditions.checkNotEmpty(str);
        byte[] bArrM3857c = m4343w1().m10779N1(c1588ze).m3857c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", (String) c1588ze.f14808e);
        contentValues.put("timestamp", Long.valueOf(c1588ze.f14805b));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", bArrM3857c);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (m8212C1().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            mo6070n().f8378g.m24554c(OL1.m6026B1(str), "Failed to insert raw event (got -1). appId");
            return false;
        } catch (SQLiteException e) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8378g.m24553b(OL1.m6026B1(str), e, "Error storing raw event. appId");
            return false;
        }
    }

    /* renamed from: d2 */
    public final boolean m8248d2(String str, int i, C10890rJ1 c10890rJ1) {
        m18576z1();
        mo7681v1();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(c10890rJ1);
        if (c10890rJ1.m24267t().isEmpty()) {
            mo6070n().f8381j.m24556e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", OL1.m6026B1(str), Integer.valueOf(i), String.valueOf(c10890rJ1.m24273z() ? Integer.valueOf(c10890rJ1.m24265q()) : null));
            return false;
        }
        byte[] bArrM3857c = c10890rJ1.m3857c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c10890rJ1.m24273z() ? Integer.valueOf(c10890rJ1.m24265q()) : null);
        contentValues.put("event_name", c10890rJ1.m24267t());
        contentValues.put("session_scoped", c10890rJ1.m24262A() ? Boolean.valueOf(c10890rJ1.m24271x()) : null);
        contentValues.put("data", bArrM3857c);
        try {
            if (m8212C1().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo6070n().f8378g.m24554c(OL1.m6026B1(str), "Failed to insert event filter (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Error storing event filter. appId");
            return false;
        }
    }

    /* renamed from: e2 */
    public final boolean m8249e2(String str, int i, C11656xJ1 c11656xJ1) {
        m18576z1();
        mo7681v1();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(c11656xJ1);
        if (c11656xJ1.m25831q().isEmpty()) {
            mo6070n().f8381j.m24556e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", OL1.m6026B1(str), Integer.valueOf(i), String.valueOf(c11656xJ1.m25835u() ? Integer.valueOf(c11656xJ1.m25829m()) : null));
            return false;
        }
        byte[] bArrM3857c = c11656xJ1.m3857c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c11656xJ1.m25835u() ? Integer.valueOf(c11656xJ1.m25829m()) : null);
        contentValues.put("property_name", c11656xJ1.m25831q());
        contentValues.put("session_scoped", c11656xJ1.m25836v() ? Boolean.valueOf(c11656xJ1.m25834t()) : null);
        contentValues.put("data", bArrM3857c);
        try {
            if (m8212C1().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo6070n().f8378g.m24554c(OL1.m6026B1(str), "Failed to insert property filter (got -1). appId");
            return false;
        } catch (SQLiteException e) {
            mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Error storing property filter. appId");
            return false;
        }
    }

    /* renamed from: f2 */
    public final boolean m8250f2(C7571Ey1 c7571Ey1) {
        Preconditions.checkNotNull(c7571Ey1);
        mo7681v1();
        m18576z1();
        String str = c7571Ey1.f2987a;
        Preconditions.checkNotNull(str);
        if (m8265v2(str, c7571Ey1.f2989c.f35239b) == null && m8255k2("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c7571Ey1.f2988b);
        contentValues.put("name", c7571Ey1.f2989c.f35239b);
        m8208R1(contentValues, Preconditions.checkNotNull(c7571Ey1.f2989c.zza()));
        contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.valueOf(c7571Ey1.f2991e));
        contentValues.put("trigger_event_name", c7571Ey1.f2992f);
        contentValues.put("trigger_timeout", Long.valueOf(c7571Ey1.f2994h));
        m7852u1();
        contentValues.put("timed_out_event", C10282mZ1.m22853l2(c7571Ey1.f2993g));
        contentValues.put("creation_timestamp", Long.valueOf(c7571Ey1.f2990d));
        m7852u1();
        contentValues.put("triggered_event", C10282mZ1.m22853l2(c7571Ey1.f2995i));
        contentValues.put("triggered_timestamp", Long.valueOf(c7571Ey1.f2989c.f35240c));
        contentValues.put("time_to_live", Long.valueOf(c7571Ey1.f2996j));
        m7852u1();
        contentValues.put("expired_event", C10282mZ1.m22853l2(c7571Ey1.f2997k));
        try {
            if (m8212C1().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            mo6070n().f8378g.m24554c(OL1.m6026B1(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            OL1 ol1Mo6070n = mo6070n();
            ol1Mo6070n.f8378g.m24553b(OL1.m6026B1(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* renamed from: g2 */
    public final boolean m8251g2(C10666pZ1 c10666pZ1) {
        Preconditions.checkNotNull(c10666pZ1);
        mo7681v1();
        m18576z1();
        String str = c10666pZ1.f40210a;
        String str2 = c10666pZ1.f40212c;
        C10666pZ1 c10666pZ1M8265v2 = m8265v2(str, str2);
        String str3 = c10666pZ1.f40211b;
        if (c10666pZ1M8265v2 == null) {
            if (C10282mZ1.m22839C2(str2)) {
                if (m8255k2("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(((C9110dP1) this.f11615b).f26037g.m6518z1(str, IB1.f4762R), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && m8255k2("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(c10666pZ1.f40213d));
        m8208R1(contentValues, c10666pZ1.f40214e);
        try {
            if (m8212C1().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            mo6070n().f8378g.m24554c(OL1.m6026B1(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Error storing user property. appId");
            return true;
        }
    }

    /* renamed from: h2 */
    public final boolean m8252h2() {
        return ((C9110dP1) this.f11615b).f26031a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: i2 */
    public final String m8253i2() {
        long jCurrentTimeMillis = ((C9110dP1) this.f11615b).f26044n.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) IB1.f4756O.m3028a(null);
        l.getClass();
        return AbstractC11153tN0.m24912x("(", "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")", " OR ", AbstractC0852NX.m5760i(AbstractC7222ym.m26239p("(upload_type != 1 AND ABS(creation_timestamp - ", jCurrentTimeMillis, ") > "), ((Long) IB1.f4754N.m3028a(null)).longValue(), ")"), ")");
    }

    /* renamed from: j2 */
    public final long m8254j2(String str) {
        long jM8220G1;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        mo7681v1();
        m18576z1();
        SQLiteDatabase sQLiteDatabaseM8212C1 = m8212C1();
        sQLiteDatabaseM8212C1.beginTransaction();
        long j = 0;
        try {
            try {
                jM8220G1 = m8220G1("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jM8220G1 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM8212C1.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        mo6070n().f8378g.m24553b(OL1.m6026B1(str), "first_open_count", "Failed to insert column (got -1). appId");
                        return -1L;
                    }
                    jM8220G1 = 0;
                }
            } catch (SQLiteException e) {
                e = e;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + jM8220G1));
                if (sQLiteDatabaseM8212C1.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    mo6070n().f8378g.m24553b(OL1.m6026B1(str), "first_open_count", "Failed to update column (got 0). appId");
                    return -1L;
                }
                sQLiteDatabaseM8212C1.setTransactionSuccessful();
                return jM8220G1;
            } catch (SQLiteException e2) {
                long j2 = jM8220G1;
                e = e2;
                j = j2;
                mo6070n().f8378g.m24556e("Error inserting column. appId", OL1.m6026B1(str), "first_open_count", e);
                sQLiteDatabaseM8212C1.endTransaction();
                return j;
            }
        } finally {
            sQLiteDatabaseM8212C1.endTransaction();
        }
    }

    /* renamed from: k2 */
    public final long m8255k2(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m8212C1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                mo6070n().f8378g.m24553b(str, e, "Database error");
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
    /* renamed from: l2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m8256l2(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.mo7681v1()
            r3.m18576z1()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.m8212C1()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 != 0) goto L33
            OL1 r5 = r3.mo6070n()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            rx r5 = r5.f8386o     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.m24555d(r1)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
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
            OL1 r1 = r3.mo6070n()     // Catch: java.lang.Throwable -> L2e
            rx r1 = r1.f8378g     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Error selecting expired configs"
            r1.m24554c(r5, r2)     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8256l2(long):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00a1, code lost:
    
        mo6070n().f8378g.m24554c(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0120  */
    /* renamed from: n2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m8257n2(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8257n2(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: o2 */
    public final void m8258o2(Long l) {
        mo7681v1();
        m18576z1();
        Preconditions.checkNotNull(l);
        if (((C9110dP1) this.f11615b).f26037g.m6511E1(null, IB1.f4745I0) && m8252h2()) {
            if (m8255k2("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                mo6070n().f8381j.m24555d("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m8212C1().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l + " AND retry_count < 2147483647");
            } catch (SQLiteException e) {
                mo6070n().f8378g.m24554c(e, "Error incrementing retry count. error");
            }
        }
    }

    /* renamed from: p2 */
    public final void m8259p2(String str, ArrayList arrayList) {
        Preconditions.checkNotEmpty(str);
        m18576z1();
        mo7681v1();
        SQLiteDatabase sQLiteDatabaseM8212C1 = m8212C1();
        try {
            long jM8255k2 = m8255k2("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, ((C9110dP1) this.f11615b).f26037g.m6518z1(str, IB1.f4760Q)));
            if (jM8255k2 <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                Integer num = (Integer) arrayList.get(i);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseM8212C1.delete("audience_filter_values", AbstractC7222ym.m26234k("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", AbstractC7222ym.m26234k("(", TextUtils.join(StringUtils.COMMA, arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e) {
            mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Database error querying filters. appId");
        }
    }

    /* renamed from: q2 */
    public final void m8260q2(String str, XQ1 xq1) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(xq1);
        mo7681v1();
        m18576z1();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", xq1.m9051l());
        contentValues.put("consent_source", Integer.valueOf(xq1.f13757b));
        m8236Q1(contentValues);
    }

    /* renamed from: r2 */
    public final long m8261r2(String str) {
        Preconditions.checkNotEmpty(str);
        return m8220G1("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* renamed from: s2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C7571Ey1 m8262s2(java.lang.String r28, java.lang.String r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8262s2(java.lang.String, java.lang.String):Ey1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0135  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* renamed from: t2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C10618pB1 m8263t2(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8263t2(java.lang.String, java.lang.String, java.lang.String):pB1");
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
    /* renamed from: u2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.PM1 m8264u2(java.lang.String r54) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8264u2(java.lang.String):PM1");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0095  */
    /* renamed from: v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C10666pZ1 m8265v2(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r10.mo7681v1()
            r10.m18576z1()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m8212C1()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
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
            java.lang.Object r9 = r10.m8224I1(r1, r2)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
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
            OL1 r3 = r10.mo6070n()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            rx r3 = r3.f8378g     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            iM1 r5 = p000.OL1.m6026B1(r11)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r3.m24554c(r5, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
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
            OL1 r3 = r10.mo6070n()     // Catch: java.lang.Throwable -> L67
            rx r3 = r3.f8378g     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "Error querying user property. appId"
            iM1 r11 = p000.OL1.m6026B1(r11)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r5 = r10.f11615b     // Catch: java.lang.Throwable -> L67
            dP1 r5 = (p000.C9110dP1) r5     // Catch: java.lang.Throwable -> L67
            EL1 r5 = r5.f26043m     // Catch: java.lang.Throwable -> L67
            java.lang.String r12 = r5.m2167g(r12)     // Catch: java.lang.Throwable -> L67
            r3.m24556e(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L67
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8265v2(java.lang.String, java.lang.String):pZ1");
    }

    /* renamed from: w2 */
    public final Map m8266w2(String str, String str2) throws Throwable {
        m18576z1();
        mo7681v1();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        C7119x8 c7119x8 = new C7119x8();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m8212C1().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        Map mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        return mapEmptyMap;
                    }
                    do {
                        try {
                            C10890rJ1 c10890rJ1 = (C10890rJ1) ((C10762qJ1) C8997cZ1.m10763P1(C10890rJ1.m24261r(), cursorQuery.getBlob(1))).m23412e();
                            int i = cursorQuery.getInt(0);
                            List arrayList = (List) c7119x8.getOrDefault(Integer.valueOf(i), null);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c7119x8.put(Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(c10890rJ1);
                        } catch (IOException e) {
                            mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Failed to merge filter. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    return c7119x8;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = cursorQuery;
                    mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Database error querying filters. appId");
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

    /* renamed from: x2 */
    public final Map m8267x2(String str, String str2) throws Throwable {
        m18576z1();
        mo7681v1();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        C7119x8 c7119x8 = new C7119x8();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m8212C1().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        Map mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        return mapEmptyMap;
                    }
                    do {
                        try {
                            C11656xJ1 c11656xJ1 = (C11656xJ1) ((C11529wJ1) C8997cZ1.m10763P1(C11656xJ1.m25828p(), cursorQuery.getBlob(1))).m23412e();
                            int i = cursorQuery.getInt(0);
                            List arrayList = (List) c7119x8.getOrDefault(Integer.valueOf(i), null);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c7119x8.put(Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(c11656xJ1);
                        } catch (IOException e) {
                            mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Failed to merge filter");
                        }
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    return c7119x8;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = cursorQuery;
                    mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Database error querying filters. appId");
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

    /* renamed from: y2 */
    public final XQ1 m8268y2(String str) {
        Preconditions.checkNotNull(str);
        mo7681v1();
        m18576z1();
        return XQ1.m9043d(100, m8226J1("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0060  */
    /* renamed from: z2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.XQ1 m8269z2(java.lang.String r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r4.mo7681v1()
            r4.m18576z1()
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.m8212C1()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            if (r0 != 0) goto L32
            OL1 r0 = r4.mo6070n()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            rx r0 = r0.f8386o     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            java.lang.String r2 = "No data found"
            r0.m24555d(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
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
            XQ1 r1 = p000.XQ1.m9043d(r2, r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r5.close()
            goto L58
        L44:
            r0 = move-exception
            goto L5e
        L46:
            r0 = move-exception
            r5 = r1
        L48:
            OL1 r2 = r4.mo6070n()     // Catch: java.lang.Throwable -> L2d
            rx r2 = r2.f8378g     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Error querying database."
            r2.m24554c(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L58
            r5.close()
        L58:
            if (r1 != 0) goto L5d
            XQ1 r5 = p000.XQ1.f13755c
            return r5
        L5d:
            return r1
        L5e:
            if (r1 == 0) goto L63
            r1.close()
        L63:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8405Uz1.m8269z2(java.lang.String):XQ1");
    }
}
