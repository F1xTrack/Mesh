package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.wrappers.Wrappers;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: ix0 */
/* loaded from: classes.dex */
public final class C5217ix0 implements I9, InterfaceC6770r40 {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public int a;
    public int b;
    public Object c;

    public /* synthetic */ C5217ix0(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }

    public static void e(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        QL1.b((j2 >> 8) == 0, "out of range: %s", j2);
        byteBuffer.put((byte) j2);
    }

    @Override // defpackage.I9
    public int a() {
        return this.a;
    }

    @Override // defpackage.I9
    public int b() {
        return this.b;
    }

    @Override // defpackage.I9
    public int c() {
        int i = this.a;
        return i == -1 ? ((C4103hA0) this.c).y() : i;
    }

    public void d(SP sp, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(sp, "event");
        ((InterfaceC7405uP) this.c).g(new L80(sp, interfaceC6099nZ, this.a, this.b));
    }

    public synchronized int f() {
        PackageInfo packageInfo;
        if (this.a == 0) {
            try {
                packageInfo = Wrappers.packageManager((Context) this.c).getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e2) {
                "Failed to find package ".concat(e2.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.a = packageInfo.versionCode;
            }
        }
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0043 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:42:0x0001, B:46:0x0007, B:51:0x0021, B:53:0x0028, B:55:0x003a, B:65:0x005d, B:60:0x0043, B:62:0x0056, B:68:0x0061, B:72:0x0069), top: B:77:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized int g() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.b     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            java.lang.Object r0 = r5.c     // Catch: java.lang.Throwable -> L41
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L41
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L41
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r0 = r0.checkPermission(r2, r3)     // Catch: java.lang.Throwable -> L41
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L21
            monitor-exit(r5)
            return r3
        L21:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L41
            r2 = 1
            if (r0 != 0) goto L43
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L41
            java.util.List r0 = r1.queryIntentServices(r0, r3)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L43
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L43
            goto L5d
        L41:
            r0 = move-exception
            goto L6d
        L43:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L41
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)     // Catch: java.lang.Throwable -> L41
            r1 = 2
            if (r0 == 0) goto L61
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L61
            r2 = r1
        L5d:
            r5.b = r2     // Catch: java.lang.Throwable -> L41
            monitor-exit(r5)
            return r2
        L61:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L41
            if (r2 == r0) goto L68
            goto L69
        L68:
            r2 = r1
        L69:
            r5.b = r2     // Catch: java.lang.Throwable -> L41
            monitor-exit(r5)
            return r2
        L6d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L41
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5217ix0.g():int");
    }

    @Override // defpackage.WC
    public ZC s0() {
        return new IF(this.a, this.b, (N8) this.c);
    }

    public C5217ix0(int i) {
        switch (i) {
            case 5:
                this.c = new C5217ix0[256];
                this.a = 0;
                this.b = 0;
                break;
            default:
                this.c = new N8(13);
                this.a = JosStatusCodes.RTN_CODE_COMMON_ERROR;
                this.b = JosStatusCodes.RTN_CODE_COMMON_ERROR;
                break;
        }
    }

    public C5217ix0(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.c = new ArrayList();
        this.b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), TG0.g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                this.b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1960Yx().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
