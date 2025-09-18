package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: tS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7224tS0 implements InterfaceC7493us0 {
    public final /* synthetic */ int a;
    public final Resources b;

    public /* synthetic */ C7224tS0(Resources resources, int i) {
        this.a = i;
        this.b = resources;
    }

    @Override // defpackage.InterfaceC7493us0
    public final InterfaceC7302ts0 a(T71 t71) {
        switch (this.a) {
            case 0:
                return new C3908g9(this.b, t71.z(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C3908g9(this.b, t71.z(Uri.class, ParcelFileDescriptor.class));
            case 2:
                return new C3908g9(this.b, t71.z(Uri.class, InputStream.class));
            default:
                return new C3908g9(this.b, C1674Vf1.b);
        }
    }
}
