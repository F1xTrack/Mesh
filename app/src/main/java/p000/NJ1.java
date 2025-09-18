package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class NJ1 {

    /* renamed from: a */
    public static final C8774aq0 f7726a = new C8774aq0(24);

    /* renamed from: a */
    public static ArrayList m5622a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* renamed from: b */
    public static long m5623b(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? LocalNotification.Repeat.Time.ONE_MINUTE : 10000 << r6);
    }

    /* renamed from: c */
    public static ArrayList m5624c(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
