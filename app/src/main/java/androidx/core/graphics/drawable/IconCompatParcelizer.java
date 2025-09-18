package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import p000.AbstractC7487Di1;
import p000.C7539Ei1;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC7487Di1 abstractC7487Di1) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f16097a = abstractC7487Di1.m1850f(iconCompat.f16097a, 1);
        byte[] bArr = iconCompat.f16099c;
        if (abstractC7487Di1.mo1849e(2)) {
            Parcel parcel = ((C7539Ei1) abstractC7487Di1).f2847e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f16099c = bArr;
        iconCompat.f16100d = abstractC7487Di1.m1851g(iconCompat.f16100d, 3);
        iconCompat.f16101e = abstractC7487Di1.m1850f(iconCompat.f16101e, 4);
        iconCompat.f16102f = abstractC7487Di1.m1850f(iconCompat.f16102f, 5);
        iconCompat.f16103g = (ColorStateList) abstractC7487Di1.m1851g(iconCompat.f16103g, 6);
        String string = iconCompat.f16105i;
        if (abstractC7487Di1.mo1849e(7)) {
            string = ((C7539Ei1) abstractC7487Di1).f2847e.readString();
        }
        iconCompat.f16105i = string;
        String string2 = iconCompat.f16106j;
        if (abstractC7487Di1.mo1849e(8)) {
            string2 = ((C7539Ei1) abstractC7487Di1).f2847e.readString();
        }
        iconCompat.f16106j = string2;
        iconCompat.f16104h = PorterDuff.Mode.valueOf(iconCompat.f16105i);
        switch (iconCompat.f16097a) {
            case -1:
                Parcelable parcelable = iconCompat.f16100d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f16098b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f16100d;
                if (parcelable2 != null) {
                    iconCompat.f16098b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f16099c;
                    iconCompat.f16098b = bArr3;
                    iconCompat.f16097a = 3;
                    iconCompat.f16101e = 0;
                    iconCompat.f16102f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f16099c, Charset.forName("UTF-16"));
                iconCompat.f16098b = str;
                if (iconCompat.f16097a == 2 && iconCompat.f16106j == null) {
                    iconCompat.f16106j = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f16098b = iconCompat.f16099c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC7487Di1 abstractC7487Di1) {
        abstractC7487Di1.getClass();
        iconCompat.f16105i = iconCompat.f16104h.name();
        switch (iconCompat.f16097a) {
            case -1:
                iconCompat.f16100d = (Parcelable) iconCompat.f16098b;
                break;
            case 1:
            case 5:
                iconCompat.f16100d = (Parcelable) iconCompat.f16098b;
                break;
            case 2:
                iconCompat.f16099c = ((String) iconCompat.f16098b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f16099c = (byte[]) iconCompat.f16098b;
                break;
            case 4:
            case 6:
                iconCompat.f16099c = iconCompat.f16098b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f16097a;
        if (-1 != i) {
            abstractC7487Di1.m1854j(i, 1);
        }
        byte[] bArr = iconCompat.f16099c;
        if (bArr != null) {
            abstractC7487Di1.mo1853i(2);
            int length = bArr.length;
            Parcel parcel = ((C7539Ei1) abstractC7487Di1).f2847e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f16100d;
        if (parcelable != null) {
            abstractC7487Di1.m1855k(parcelable, 3);
        }
        int i2 = iconCompat.f16101e;
        if (i2 != 0) {
            abstractC7487Di1.m1854j(i2, 4);
        }
        int i3 = iconCompat.f16102f;
        if (i3 != 0) {
            abstractC7487Di1.m1854j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f16103g;
        if (colorStateList != null) {
            abstractC7487Di1.m1855k(colorStateList, 6);
        }
        String str = iconCompat.f16105i;
        if (str != null) {
            abstractC7487Di1.mo1853i(7);
            ((C7539Ei1) abstractC7487Di1).f2847e.writeString(str);
        }
        String str2 = iconCompat.f16106j;
        if (str2 != null) {
            abstractC7487Di1.mo1853i(8);
            ((C7539Ei1) abstractC7487Di1).f2847e.writeString(str2);
        }
    }
}
