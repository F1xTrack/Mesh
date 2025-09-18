package defpackage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.File;

/* renamed from: sL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7012sL0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC7012sL0(String str, Object obj, boolean z, Promise promise, int i) {
        this.a = i;
        this.b = str;
        this.e = obj;
        this.c = z;
        this.d = promise;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC7012sL0.run():void");
    }

    public /* synthetic */ RunnableC7012sL0(C2528cV1 c2528cV1, EY1 ey1, boolean z, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.a = i;
        this.b = ey1;
        this.c = z;
        this.e = abstractSafeParcelable;
        this.d = c2528cV1;
    }

    public RunnableC7012sL0(C2528cV1 c2528cV1, EY1 ey1, boolean z, C0406Ey1 c0406Ey1, C0406Ey1 c0406Ey12) {
        this.a = 5;
        this.b = ey1;
        this.c = z;
        this.e = c0406Ey1;
        this.d = c2528cV1;
    }

    public RunnableC7012sL0(AbstractC7076sg1 abstractC7076sg1, boolean z, File file, XY xy) {
        this.a = 2;
        this.d = abstractC7076sg1;
        this.c = z;
        this.b = file;
        this.e = xy;
    }
}
