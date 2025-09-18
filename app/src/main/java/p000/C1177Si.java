package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.WeakHashMap;

/* renamed from: Si */
/* loaded from: classes.dex */
public final class C1177Si {

    /* renamed from: a */
    public final /* synthetic */ int f10912a;

    /* renamed from: b */
    public int f10913b;

    /* renamed from: c */
    public boolean f10914c;

    /* renamed from: d */
    public final Object f10915d;

    /* renamed from: e */
    public final Object f10916e;

    public C1177Si(MessageDigest messageDigest, int i) {
        this.f10912a = 2;
        this.f10915d = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f10916e = messageDigest;
        this.f10913b = i;
    }

    /* renamed from: a */
    public void m7419a(int i) {
        Object obj = this.f10915d;
        Object obj2 = this.f10916e;
        switch (this.f10912a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f18110U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f10913b = i;
                    if (!this.f10914c) {
                        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                        ((View) bottomSheetBehavior.f18110U.get()).postOnAnimation((GR0) obj);
                        this.f10914c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f18248p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f10913b = i;
                    if (!this.f10914c) {
                        WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                        ((View) sideSheetBehavior.f18248p.get()).postOnAnimation((RunnableC8352Tz0) obj);
                        this.f10914c = true;
                        break;
                    }
                }
                break;
        }
    }

    public C1177Si(SideSheetBehavior sideSheetBehavior) {
        this.f10912a = 1;
        this.f10916e = sideSheetBehavior;
        this.f10915d = new RunnableC8352Tz0(25, this);
    }

    public C1177Si(BottomSheetBehavior bottomSheetBehavior) {
        this.f10912a = 0;
        this.f10916e = bottomSheetBehavior;
        this.f10915d = new GR0(5, this);
    }
}
