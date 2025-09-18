package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.WeakHashMap;

/* renamed from: Si, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447Si {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;

    public C1447Si(MessageDigest messageDigest, int i) {
        this.a = 2;
        this.d = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.e = messageDigest;
        this.b = i;
    }

    public void a(int i) {
        Object obj = this.d;
        Object obj2 = this.e;
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        WeakHashMap weakHashMap = AbstractC6897rk1.a;
                        ((View) bottomSheetBehavior.U.get()).postOnAnimation((GR0) obj);
                        this.c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((RunnableC1577Tz0) obj);
                        this.c = true;
                        break;
                    }
                }
                break;
        }
    }

    public C1447Si(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.e = sideSheetBehavior;
        this.d = new RunnableC1577Tz0(25, this);
    }

    public C1447Si(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new GR0(5, this);
    }
}
