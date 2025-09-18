package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class IA1 {
    public static final SparseArray a;
    public static final SparseArray b;
    public static final AtomicReference c;
    public static final HashMap d;

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        b = sparseArray2;
        c = new AtomicReference();
        sparseArray.put(-1, EnumC8091y02.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC8091y02.FORMAT_CODE_128);
        sparseArray.put(2, EnumC8091y02.FORMAT_CODE_39);
        sparseArray.put(4, EnumC8091y02.FORMAT_CODE_93);
        sparseArray.put(8, EnumC8091y02.FORMAT_CODABAR);
        sparseArray.put(16, EnumC8091y02.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC8091y02.FORMAT_EAN_13);
        sparseArray.put(64, EnumC8091y02.FORMAT_EAN_8);
        sparseArray.put(128, EnumC8091y02.FORMAT_ITF);
        sparseArray.put(256, EnumC8091y02.FORMAT_QR_CODE);
        sparseArray.put(512, EnumC8091y02.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC8091y02.FORMAT_UPC_E);
        sparseArray.put(2048, EnumC8091y02.FORMAT_PDF417);
        sparseArray.put(4096, EnumC8091y02.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC8281z02.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC8281z02.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC8281z02.TYPE_EMAIL);
        sparseArray2.put(3, EnumC8281z02.TYPE_ISBN);
        sparseArray2.put(4, EnumC8281z02.TYPE_PHONE);
        sparseArray2.put(5, EnumC8281z02.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC8281z02.TYPE_SMS);
        sparseArray2.put(7, EnumC8281z02.TYPE_TEXT);
        sparseArray2.put(8, EnumC8281z02.TYPE_URL);
        sparseArray2.put(9, EnumC8281z02.TYPE_WIFI);
        sparseArray2.put(10, EnumC8281z02.TYPE_GEO);
        sparseArray2.put(11, EnumC8281z02.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC8281z02.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        d = map;
        map.put(1, X22.CODE_128);
        map.put(2, X22.CODE_39);
        map.put(4, X22.CODE_93);
        map.put(8, X22.CODABAR);
        map.put(16, X22.DATA_MATRIX);
        map.put(32, X22.EAN_13);
        map.put(64, X22.EAN_8);
        map.put(128, X22.ITF);
        map.put(256, X22.QR_CODE);
        map.put(512, X22.UPC_A);
        map.put(1024, X22.UPC_E);
        map.put(2048, X22.PDF417);
        map.put(4096, X22.AZTEC);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.Y22 a(defpackage.C0425Ff r4) {
        /*
            int r4 = r4.a
            Ly1 r0 = new Ly1
            r0.<init>()
            java.util.HashMap r1 = defpackage.IA1.d
            if (r4 != 0) goto L46
            java.util.Collection r4 = r1.values()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r1 = r4 instanceof java.util.Collection
            if (r1 == 0) goto L34
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r0.b
            int r3 = r1.size()
            int r3 = r3 + r2
            r0.c(r3)
            boolean r2 = r1 instanceof defpackage.AbstractC7371uD1
            if (r2 != 0) goto L27
            goto L34
        L27:
            uD1 r1 = (defpackage.AbstractC7371uD1) r1
            java.lang.Object[] r4 = r0.a
            int r2 = r0.b
            int r4 = r1.b(r2, r4)
            r0.b = r4
            goto L71
        L34:
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r4.next()
            r0.b(r1)
            goto L38
        L46:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L4e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r3 = r3 & r4
            if (r3 == 0) goto L4e
            java.lang.Object r2 = r2.getValue()
            X22 r2 = (defpackage.X22) r2
            r0.b(r2)
            goto L4e
        L71:
            GQ0 r4 = new GQ0
            r1 = 15
            r4.<init>(r1)
            ZE1 r0 = r0.d()
            r4.b = r0
            Y22 r0 = new Y22
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IA1.a(Ff):Y22");
    }

    public static void b(C5814m32 c5814m32, EnumC6184o02 enumC6184o02) {
        c5814m32.b(new C6273oT0(enumC6184o02), EnumC6375p02.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean c() {
        AtomicReference atomicReference = c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context contextB = C2406bs0.c().b();
        ZE1 ze1 = C2534cX1.h;
        boolean z = MM.a(contextB, ModuleDescriptor.MODULE_ID) > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
