package p000;

import java.util.Arrays;
import java.util.Random;

/* renamed from: z01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11869z01 {

    /* renamed from: a */
    public final Random f46567a;

    /* renamed from: b */
    public final int[] f46568b;

    /* renamed from: c */
    public final int[] f46569c;

    public C11869z01() {
        this(new Random());
    }

    /* renamed from: a */
    public final C11869z01 m26299a(int i) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        while (true) {
            random = this.f46567a;
            iArr = this.f46568b;
            if (i2 >= i) {
                break;
            }
            iArr2[i2] = random.nextInt(iArr.length + 1);
            int i3 = i2 + 1;
            int iNextInt = random.nextInt(i3);
            iArr3[i2] = iArr3[iNextInt];
            iArr3[iNextInt] = i2;
            i2 = i3;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length + i; i6++) {
            if (i4 >= i || i5 != iArr2[i4]) {
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            } else {
                iArr4[i6] = iArr3[i4];
                i4++;
            }
        }
        return new C11869z01(iArr4, new Random(random.nextLong()));
    }

    public C11869z01(int[] iArr, Random random) {
        this.f46568b = iArr;
        this.f46567a = random;
        this.f46569c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f46569c[iArr[i]] = i;
        }
    }

    public C11869z01(Random random) {
        this(new int[0], random);
    }
}
