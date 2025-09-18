package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: Uf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1596Uf1 implements InterfaceC7493us0 {
    public static final C1596Uf1 b = new C1596Uf1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C1596Uf1(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC7493us0
    public final InterfaceC7302ts0 a(T71 t71) {
        switch (this.a) {
            case 0:
                return C1674Vf1.b;
            case 1:
                return new C5750lk(0, new OJ1(8));
            case 2:
                return new C5750lk(0, new NV1(8));
            case 3:
                return new C1674Vf1(1);
            case 4:
                return new C6965s51(t71.z(Uri.class, AssetFileDescriptor.class), 0);
            case 5:
                return new C6965s51(t71.z(Uri.class, ParcelFileDescriptor.class), 0);
            case 6:
                return new C6965s51(t71.z(Uri.class, InputStream.class), 0);
            case 7:
                return new C6965s51(t71.z(E10.class, InputStream.class), 1);
            default:
                return new C3440dh1(t71.z(E10.class, InputStream.class));
        }
    }
}
