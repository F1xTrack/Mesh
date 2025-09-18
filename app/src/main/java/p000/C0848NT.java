package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: NT */
/* loaded from: classes2.dex */
public final class C0848NT implements InterfaceC7034vn {

    /* renamed from: a */
    public final /* synthetic */ int f7795a;

    /* renamed from: b */
    public long f7796b;

    /* renamed from: c */
    public final Object f7797c;

    /* renamed from: d */
    public final Object f7798d;

    public C0848NT(long j, C10996s81 c10996s81, Map map) {
        this.f7795a = 1;
        this.f7797c = map;
        this.f7798d = c10996s81;
        this.f7796b = j;
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: a */
    public void mo384a(C6551oQ c6551oQ) {
        Integer num;
        switch (this.f7795a) {
            case 1:
                Map map = (Map) this.f7797c;
                AbstractC7222ym.m26224a(this, c6551oQ);
                try {
                    Integer num2 = (Integer) map.get(CaptureResult.JPEG_ORIENTATION);
                    if (num2 != null) {
                        c6551oQ.m23400g(num2.intValue());
                    }
                } catch (BufferUnderflowException unused) {
                    AbstractC7806Jm0.m4412f("KeyValueMapCameraCaptureResult");
                }
                Long l = (Long) map.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                if (l != null) {
                    c6551oQ.m23397d(l.longValue());
                }
                Float f = (Float) map.get(CaptureResult.LENS_APERTURE);
                if (f != null) {
                    c6551oQ.m23396c(c6551oQ.f38994a, "FNumber", String.valueOf(f.floatValue()));
                }
                Integer numValueOf = (Integer) map.get(CaptureResult.SENSOR_SENSITIVITY);
                if (numValueOf != null) {
                    if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) map.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                        numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num.intValue() / 100.0f)));
                    }
                    c6551oQ.m23399f(numValueOf.intValue());
                }
                Float f2 = (Float) map.get(CaptureResult.LENS_FOCAL_LENGTH);
                if (f2 != null) {
                    c6551oQ.m23398e(f2.floatValue());
                }
                Integer num3 = (Integer) map.get(CaptureResult.CONTROL_AWB_MODE);
                if (num3 != null) {
                    c6551oQ.m23401h(num3.intValue() == 0 ? 2 : 1);
                    break;
                }
                break;
            default:
                AbstractC7222ym.m26224a(this, c6551oQ);
                break;
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: b */
    public C10996s81 mo385b() {
        switch (this.f7795a) {
        }
        return (C10996s81) this.f7798d;
    }

    /* renamed from: c */
    public List m5692c() {
        Cursor cursorQuery;
        C8405Uz1 c8405Uz1 = (C8405Uz1) this.f7798d;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(this.f7796b);
        String str = (String) this.f7797c;
        Cursor cursor = null;
        try {
            try {
                cursorQuery = c8405Uz1.m8212C1().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, strValueOf}, null, null, "rowid", "1000");
            } catch (SQLiteException e) {
                c8405Uz1.mo6070n().f8378g.m24553b(OL1.m6026B1(str), e, "Data loss. Error querying raw events batch. appId");
                if (0 != 0) {
                    cursor.close();
                }
            }
            if (!cursorQuery.moveToFirst()) {
                List listEmptyList = Collections.emptyList();
                cursorQuery.close();
                return listEmptyList;
            }
            do {
                long j = cursorQuery.getLong(0);
                long j2 = cursorQuery.getLong(3);
                boolean z = cursorQuery.getLong(5) == 1;
                byte[] blob = cursorQuery.getBlob(4);
                if (j > this.f7796b) {
                    this.f7796b = j;
                }
                try {
                    JK1 jk1 = (JK1) C8997cZ1.m10763P1(KK1.m4605z(), blob);
                    String string = cursorQuery.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    jk1.m23414i();
                    KK1.m4599q(string, (KK1) jk1.f39024b);
                    long j3 = cursorQuery.getLong(2);
                    jk1.m23414i();
                    KK1.m4604w(j3, (KK1) jk1.f39024b);
                    arrayList.add(new C10488oA1(j, j2, z, (KK1) jk1.m23412e()));
                } catch (IOException e2) {
                    c8405Uz1.mo6070n().f8378g.m24553b(OL1.m6026B1(str), e2, "Data loss. Failed to merge raw event. appId");
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC7034vn
    public long getTimestamp() {
        switch (this.f7795a) {
            case 1:
                return this.f7796b;
            default:
                InterfaceC7034vn interfaceC7034vn = (InterfaceC7034vn) this.f7797c;
                if (interfaceC7034vn != null) {
                    return interfaceC7034vn.getTimestamp();
                }
                long j = this.f7796b;
                if (j != -1) {
                    return j;
                }
                throw new IllegalStateException("No timestamp is available.");
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: h */
    public EnumC6908tn mo391h() {
        switch (this.f7795a) {
            case 1:
                Integer num = (Integer) ((Map) this.f7797c).get(CaptureResult.CONTROL_AWB_STATE);
                EnumC6908tn enumC6908tn = EnumC6908tn.f43251a;
                if (num == null) {
                    return enumC6908tn;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    return EnumC6908tn.f43252b;
                }
                if (iIntValue == 1) {
                    return EnumC6908tn.f43253c;
                }
                if (iIntValue == 2) {
                    return EnumC6908tn.f43254d;
                }
                if (iIntValue == 3) {
                    return EnumC6908tn.f43255e;
                }
                AbstractC7806Jm0.m4412f("KeyValueMapCameraCaptureResult");
                return enumC6908tn;
            default:
                InterfaceC7034vn interfaceC7034vn = (InterfaceC7034vn) this.f7797c;
                return interfaceC7034vn != null ? interfaceC7034vn.mo391h() : EnumC6908tn.f43251a;
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: i */
    public int mo392i() {
        switch (this.f7795a) {
            case 1:
                Integer num = (Integer) ((Map) this.f7797c).get(CaptureResult.FLASH_STATE);
                if (num == null) {
                    return 1;
                }
                int iIntValue = num.intValue();
                int i = 2;
                if (iIntValue != 0 && iIntValue != 1) {
                    if (iIntValue == 2) {
                        return 3;
                    }
                    i = 4;
                    if (iIntValue != 3 && iIntValue != 4) {
                        AbstractC7806Jm0.m4412f("KeyValueMapCameraCaptureResult");
                        return 1;
                    }
                }
                return i;
            default:
                InterfaceC7034vn interfaceC7034vn = (InterfaceC7034vn) this.f7797c;
                if (interfaceC7034vn != null) {
                    return interfaceC7034vn.mo392i();
                }
                return 1;
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: o */
    public EnumC6765rn mo398o() {
        switch (this.f7795a) {
            case 1:
                Integer num = (Integer) ((Map) this.f7797c).get(CaptureResult.CONTROL_AE_STATE);
                EnumC6765rn enumC6765rn = EnumC6765rn.f41898a;
                if (num == null) {
                    return enumC6765rn;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    return EnumC6765rn.f41899b;
                }
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        return EnumC6765rn.f41902e;
                    }
                    if (iIntValue == 3) {
                        return EnumC6765rn.f41903f;
                    }
                    if (iIntValue == 4) {
                        return EnumC6765rn.f41901d;
                    }
                    if (iIntValue != 5) {
                        AbstractC7806Jm0.m4412f("KeyValueMapCameraCaptureResult");
                        return enumC6765rn;
                    }
                }
                return EnumC6765rn.f41900c;
            default:
                InterfaceC7034vn interfaceC7034vn = (InterfaceC7034vn) this.f7797c;
                return interfaceC7034vn != null ? interfaceC7034vn.mo398o() : EnumC6765rn.f41898a;
        }
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: t */
    public CaptureResult mo403t() {
        switch (this.f7795a) {
        }
        return null;
    }

    @Override // p000.InterfaceC7034vn
    /* renamed from: u */
    public EnumC6845sn mo404u() {
        switch (this.f7795a) {
            case 1:
                Integer num = (Integer) ((Map) this.f7797c).get(CaptureResult.CONTROL_AF_STATE);
                EnumC6845sn enumC6845sn = EnumC6845sn.f42594a;
                if (num == null) {
                    return enumC6845sn;
                }
                switch (num.intValue()) {
                    case 0:
                        return EnumC6845sn.f42595b;
                    case 1:
                    case 3:
                        return EnumC6845sn.f42596c;
                    case 2:
                        return EnumC6845sn.f42597d;
                    case 4:
                        return EnumC6845sn.f42599f;
                    case 5:
                        return EnumC6845sn.f42600g;
                    case 6:
                        return EnumC6845sn.f42598e;
                    default:
                        AbstractC7806Jm0.m4412f("KeyValueMapCameraCaptureResult");
                        return enumC6845sn;
                }
            default:
                InterfaceC7034vn interfaceC7034vn = (InterfaceC7034vn) this.f7797c;
                return interfaceC7034vn != null ? interfaceC7034vn.mo404u() : EnumC6845sn.f42594a;
        }
    }

    public C0848NT(C8405Uz1 c8405Uz1, String str) {
        this.f7795a = 3;
        this.f7798d = c8405Uz1;
        Preconditions.checkNotEmpty(str);
        this.f7797c = str;
        this.f7796b = -1L;
    }

    public C0848NT(C8405Uz1 c8405Uz1, String str, long j) {
        this.f7795a = 3;
        this.f7798d = c8405Uz1;
        Preconditions.checkNotEmpty(str);
        this.f7797c = str;
        this.f7796b = c8405Uz1.m8220G1("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public C0848NT(InterfaceC7034vn interfaceC7034vn, C10996s81 c10996s81, long j) {
        this.f7795a = 2;
        this.f7797c = interfaceC7034vn;
        this.f7798d = c10996s81;
        this.f7796b = j;
    }

    public C0848NT(C1414WT c1414wt, String str) {
        this.f7795a = 0;
        this.f7797c = str;
        this.f7798d = c1414wt;
        this.f7796b = -1L;
    }
}
