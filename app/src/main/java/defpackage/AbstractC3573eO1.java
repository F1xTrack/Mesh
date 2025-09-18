package defpackage;

import android.media.AudioRecord;
import android.util.Range;
import android.util.Rational;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: eO1 */
/* loaded from: classes.dex */
public abstract class AbstractC3573eO1 {
    public static Signature a(String str, PSSParameterSpec pSSParameterSpec) throws C7248ta0, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        try {
            Signature signature = Signature.getInstance(str);
            if (pSSParameterSpec != null) {
                try {
                    signature.setParameter(pSSParameterSpec);
                } catch (InvalidAlgorithmParameterException e) {
                    throw new C7248ta0("Invalid RSASSA-PSS salt length parameter: " + e.getMessage(), e);
                }
            }
            return signature;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static int b(int i, int i2, int i3, int i4, int i5, Range range) {
        int iDoubleValue = (int) (new Rational(i4, i5).doubleValue() * new Rational(i2, i3).doubleValue() * i);
        if (AbstractC0759Jm0.e("AudioConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(iDoubleValue));
        }
        if (!C7253tc.f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (AbstractC0759Jm0.e("AudioConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        AbstractC0759Jm0.f("AudioConfigUtil");
        return iDoubleValue;
    }

    public static int c(Range range, int i, int i2, int i3) {
        ArrayList arrayList = null;
        int i4 = i3;
        int i5 = 0;
        while (true) {
            if (range.contains((Range) Integer.valueOf(i4))) {
                int i6 = C1033Na.n;
                if (i4 > 0 && i > 0) {
                    if (AudioRecord.getMinBufferSize(i4, i == 1 ? 16 : 12, i2) > 0) {
                        return i4;
                    }
                }
                AbstractC0759Jm0.f("AudioConfigUtil");
            } else {
                range.toString();
                AbstractC0759Jm0.f("AudioConfigUtil");
            }
            if (arrayList == null) {
                AbstractC0759Jm0.f("AudioConfigUtil");
                arrayList = new ArrayList(C7062sc.e);
                Collections.sort(arrayList, new C3417da(i3, 0));
            }
            if (i5 >= arrayList.size()) {
                AbstractC0759Jm0.f("AudioConfigUtil");
                return 44100;
            }
            int i7 = i5 + 1;
            int iIntValue = ((Integer) arrayList.get(i5)).intValue();
            i5 = i7;
            i4 = iIntValue;
        }
    }
}
