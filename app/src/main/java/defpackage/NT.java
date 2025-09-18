package defpackage;

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

/* loaded from: classes2.dex */
public final class NT implements InterfaceC7668vn {
    public final /* synthetic */ int a;
    public long b;
    public final Object c;
    public final Object d;

    public NT(long j, C6974s81 c6974s81, Map map) {
        this.a = 1;
        this.c = map;
        this.d = c6974s81;
        this.b = j;
    }

    @Override // defpackage.InterfaceC7668vn
    public void a(C6263oQ c6263oQ) {
        Integer num;
        switch (this.a) {
            case 1:
                Map map = (Map) this.c;
                AbstractC8235ym.a(this, c6263oQ);
                try {
                    Integer num2 = (Integer) map.get(CaptureResult.JPEG_ORIENTATION);
                    if (num2 != null) {
                        c6263oQ.g(num2.intValue());
                    }
                } catch (BufferUnderflowException unused) {
                    AbstractC0759Jm0.f("KeyValueMapCameraCaptureResult");
                }
                Long l = (Long) map.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                if (l != null) {
                    c6263oQ.d(l.longValue());
                }
                Float f = (Float) map.get(CaptureResult.LENS_APERTURE);
                if (f != null) {
                    c6263oQ.c(c6263oQ.a, "FNumber", String.valueOf(f.floatValue()));
                }
                Integer numValueOf = (Integer) map.get(CaptureResult.SENSOR_SENSITIVITY);
                if (numValueOf != null) {
                    if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) map.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                        numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num.intValue() / 100.0f)));
                    }
                    c6263oQ.f(numValueOf.intValue());
                }
                Float f2 = (Float) map.get(CaptureResult.LENS_FOCAL_LENGTH);
                if (f2 != null) {
                    c6263oQ.e(f2.floatValue());
                }
                Integer num3 = (Integer) map.get(CaptureResult.CONTROL_AWB_MODE);
                if (num3 != null) {
                    c6263oQ.h(num3.intValue() == 0 ? 2 : 1);
                    break;
                }
                break;
            default:
                AbstractC8235ym.a(this, c6263oQ);
                break;
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public C6974s81 b() {
        switch (this.a) {
        }
        return (C6974s81) this.d;
    }

    public List c() {
        Cursor cursorQuery;
        C1656Uz1 c1656Uz1 = (C1656Uz1) this.d;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(this.b);
        String str = (String) this.c;
        Cursor cursor = null;
        try {
            try {
                cursorQuery = c1656Uz1.C1().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, strValueOf}, null, null, "rowid", "1000");
            } catch (SQLiteException e) {
                c1656Uz1.n().g.b(OL1.B1(str), e, "Data loss. Error querying raw events batch. appId");
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
                if (j > this.b) {
                    this.b = j;
                }
                try {
                    JK1 jk1 = (JK1) C2540cZ1.P1(KK1.z(), blob);
                    String string = cursorQuery.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    jk1.i();
                    KK1.q(string, (KK1) jk1.b);
                    long j3 = cursorQuery.getLong(2);
                    jk1.i();
                    KK1.w(j3, (KK1) jk1.b);
                    arrayList.add(new C6217oA1(j, j2, z, (KK1) jk1.e()));
                } catch (IOException e2) {
                    c1656Uz1.n().g.b(OL1.B1(str), e2, "Data loss. Failed to merge raw event. appId");
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

    @Override // defpackage.InterfaceC7668vn
    public long getTimestamp() {
        switch (this.a) {
            case 1:
                return this.b;
            default:
                InterfaceC7668vn interfaceC7668vn = (InterfaceC7668vn) this.c;
                if (interfaceC7668vn != null) {
                    return interfaceC7668vn.getTimestamp();
                }
                long j = this.b;
                if (j != -1) {
                    return j;
                }
                throw new IllegalStateException("No timestamp is available.");
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC7286tn h() {
        switch (this.a) {
            case 1:
                Integer num = (Integer) ((Map) this.c).get(CaptureResult.CONTROL_AWB_STATE);
                EnumC7286tn enumC7286tn = EnumC7286tn.a;
                if (num == null) {
                    return enumC7286tn;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    return EnumC7286tn.b;
                }
                if (iIntValue == 1) {
                    return EnumC7286tn.c;
                }
                if (iIntValue == 2) {
                    return EnumC7286tn.d;
                }
                if (iIntValue == 3) {
                    return EnumC7286tn.e;
                }
                AbstractC0759Jm0.f("KeyValueMapCameraCaptureResult");
                return enumC7286tn;
            default:
                InterfaceC7668vn interfaceC7668vn = (InterfaceC7668vn) this.c;
                return interfaceC7668vn != null ? interfaceC7668vn.h() : EnumC7286tn.a;
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public int i() {
        switch (this.a) {
            case 1:
                Integer num = (Integer) ((Map) this.c).get(CaptureResult.FLASH_STATE);
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
                        AbstractC0759Jm0.f("KeyValueMapCameraCaptureResult");
                        return 1;
                    }
                }
                return i;
            default:
                InterfaceC7668vn interfaceC7668vn = (InterfaceC7668vn) this.c;
                if (interfaceC7668vn != null) {
                    return interfaceC7668vn.i();
                }
                return 1;
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC6904rn o() {
        switch (this.a) {
            case 1:
                Integer num = (Integer) ((Map) this.c).get(CaptureResult.CONTROL_AE_STATE);
                EnumC6904rn enumC6904rn = EnumC6904rn.a;
                if (num == null) {
                    return enumC6904rn;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    return EnumC6904rn.b;
                }
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        return EnumC6904rn.e;
                    }
                    if (iIntValue == 3) {
                        return EnumC6904rn.f;
                    }
                    if (iIntValue == 4) {
                        return EnumC6904rn.d;
                    }
                    if (iIntValue != 5) {
                        AbstractC0759Jm0.f("KeyValueMapCameraCaptureResult");
                        return enumC6904rn;
                    }
                }
                return EnumC6904rn.c;
            default:
                InterfaceC7668vn interfaceC7668vn = (InterfaceC7668vn) this.c;
                return interfaceC7668vn != null ? interfaceC7668vn.o() : EnumC6904rn.a;
        }
    }

    @Override // defpackage.InterfaceC7668vn
    public CaptureResult t() {
        switch (this.a) {
        }
        return null;
    }

    @Override // defpackage.InterfaceC7668vn
    public EnumC7095sn u() {
        switch (this.a) {
            case 1:
                Integer num = (Integer) ((Map) this.c).get(CaptureResult.CONTROL_AF_STATE);
                EnumC7095sn enumC7095sn = EnumC7095sn.a;
                if (num == null) {
                    return enumC7095sn;
                }
                switch (num.intValue()) {
                    case 0:
                        return EnumC7095sn.b;
                    case 1:
                    case 3:
                        return EnumC7095sn.c;
                    case 2:
                        return EnumC7095sn.d;
                    case 4:
                        return EnumC7095sn.f;
                    case 5:
                        return EnumC7095sn.g;
                    case 6:
                        return EnumC7095sn.e;
                    default:
                        AbstractC0759Jm0.f("KeyValueMapCameraCaptureResult");
                        return enumC7095sn;
                }
            default:
                InterfaceC7668vn interfaceC7668vn = (InterfaceC7668vn) this.c;
                return interfaceC7668vn != null ? interfaceC7668vn.u() : EnumC7095sn.a;
        }
    }

    public NT(C1656Uz1 c1656Uz1, String str) {
        this.a = 3;
        this.d = c1656Uz1;
        Preconditions.checkNotEmpty(str);
        this.c = str;
        this.b = -1L;
    }

    public NT(C1656Uz1 c1656Uz1, String str, long j) {
        this.a = 3;
        this.d = c1656Uz1;
        Preconditions.checkNotEmpty(str);
        this.c = str;
        this.b = c1656Uz1.G1("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public NT(InterfaceC7668vn interfaceC7668vn, C6974s81 c6974s81, long j) {
        this.a = 2;
        this.c = interfaceC7668vn;
        this.d = c6974s81;
        this.b = j;
    }

    public NT(WT wt, String str) {
        this.a = 0;
        this.c = str;
        this.d = wt;
        this.b = -1L;
    }
}
