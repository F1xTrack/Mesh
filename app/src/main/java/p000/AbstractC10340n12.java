package p000;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: n12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10340n12 {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m23046a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m23047b(r9, r10, r11)
            boolean r1 = m23047b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = m23054i(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10340n12.m23046a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: b */
    public static boolean m23047b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static final LinkedHashSet m23048c(byte[] bArr) {
        O90.m5968f(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        O90.m5967e(uri, "uri");
                        linkedHashSet.add(new C4086fy(z, uri));
                    }
                    AbstractC8729aT1.m9749a(objectInputStream, null);
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            AbstractC8729aT1.m9749a(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    /* renamed from: d */
    public static final int m23049d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Could not convert ", " to BackoffPolicy"));
    }

    /* renamed from: e */
    public static final int m23050e(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT < 30 || i != 5) {
                    throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Could not convert ", " to NetworkType"));
                }
                return 6;
            }
        }
        return i2;
    }

    /* renamed from: f */
    public static final int m23051f(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    /* renamed from: g */
    public static final int m23052g(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                if (i == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Could not convert ", " to State"));
            }
        }
        return i2;
    }

    /* renamed from: h */
    public static boolean m23053h(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* renamed from: i */
    public static int m23054i(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* renamed from: j */
    public static int m23055j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* renamed from: k */
    public static final int m23056k(int i) {
        String str;
        AbstractC0852NX.m5764m(i, "networkType");
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 0) {
            return 0;
        }
        if (iM26247x == 1) {
            return 1;
        }
        if (iM26247x == 2) {
            return 2;
        }
        if (iM26247x == 3) {
            return 3;
        }
        if (iM26247x == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
            return 5;
        }
        StringBuilder sb = new StringBuilder("Could not convert ");
        switch (i) {
            case 1:
                str = "NOT_REQUIRED";
                break;
            case 2:
                str = "CONNECTED";
                break;
            case 3:
                str = "UNMETERED";
                break;
            case 4:
                str = "NOT_ROAMING";
                break;
            case 5:
                str = "METERED";
                break;
            case 6:
                str = "TEMPORARILY_UNMETERED";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(" to int");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: l */
    public static final byte[] m23057l(Set set) {
        O90.m5968f(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C4086fy c4086fy = (C4086fy) it.next();
                    objectOutputStream.writeUTF(c4086fy.f27513a.toString());
                    objectOutputStream.writeBoolean(c4086fy.f27514b);
                }
                AbstractC8729aT1.m9749a(objectOutputStream, null);
                AbstractC8729aT1.m9749a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                O90.m5967e(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: m */
    public static final int m23058m(int i) {
        AbstractC0852NX.m5764m(i, "state");
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 0) {
            return 0;
        }
        if (iM26247x == 1) {
            return 1;
        }
        if (iM26247x == 2) {
            return 2;
        }
        if (iM26247x == 3) {
            return 3;
        }
        if (iM26247x == 4) {
            return 4;
        }
        if (iM26247x == 5) {
            return 5;
        }
        throw new C6838sg();
    }
}
