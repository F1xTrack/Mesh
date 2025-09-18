package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import p000.AbstractC7487Di1;
import p000.C7539Ei1;
import p000.InterfaceC7591Fi1;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC7487Di1 abstractC7487Di1) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC7591Fi1 interfaceC7591Fi1M1852h = remoteActionCompat.f16090a;
        if (abstractC7487Di1.mo1849e(1)) {
            interfaceC7591Fi1M1852h = abstractC7487Di1.m1852h();
        }
        remoteActionCompat.f16090a = (IconCompat) interfaceC7591Fi1M1852h;
        CharSequence charSequence = remoteActionCompat.f16091b;
        if (abstractC7487Di1.mo1849e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C7539Ei1) abstractC7487Di1).f2847e);
        }
        remoteActionCompat.f16091b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f16092c;
        if (abstractC7487Di1.mo1849e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C7539Ei1) abstractC7487Di1).f2847e);
        }
        remoteActionCompat.f16092c = charSequence2;
        remoteActionCompat.f16093d = (PendingIntent) abstractC7487Di1.m1851g(remoteActionCompat.f16093d, 4);
        boolean z = remoteActionCompat.f16094e;
        if (abstractC7487Di1.mo1849e(5)) {
            z = ((C7539Ei1) abstractC7487Di1).f2847e.readInt() != 0;
        }
        remoteActionCompat.f16094e = z;
        boolean z2 = remoteActionCompat.f16095f;
        if (abstractC7487Di1.mo1849e(6)) {
            z2 = ((C7539Ei1) abstractC7487Di1).f2847e.readInt() != 0;
        }
        remoteActionCompat.f16095f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC7487Di1 abstractC7487Di1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC7487Di1.getClass();
        IconCompat iconCompat = remoteActionCompat.f16090a;
        abstractC7487Di1.mo1853i(1);
        abstractC7487Di1.m1856l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f16091b;
        abstractC7487Di1.mo1853i(2);
        Parcel parcel = ((C7539Ei1) abstractC7487Di1).f2847e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f16092c;
        abstractC7487Di1.mo1853i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC7487Di1.m1855k(remoteActionCompat.f16093d, 4);
        boolean z = remoteActionCompat.f16094e;
        abstractC7487Di1.mo1853i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f16095f;
        abstractC7487Di1.mo1853i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
