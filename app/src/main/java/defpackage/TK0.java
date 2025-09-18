package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class TK0 implements LifecycleEventListener, ActivityEventListener {
    public final WeakReference a;

    public TK0(C7 c7) {
        O90.f(c7, "appContext");
        this.a = new WeakReference(c7);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        O90.f(activity, "activity");
        C7 c7 = (C7) this.a.get();
        if (c7 != null) {
            D7 d7 = (D7) c7.o.b;
            String str = (String) ((HashMap) d7.c).get(Integer.valueOf(i));
            if (str != null) {
                if (((HashMap) d7.f).get(str) != null) {
                    throw new ClassCastException();
                }
                if (((HashMap) d7.e).get(str) != null) {
                    throw new ClassCastException();
                }
                ((Bundle) d7.h).putParcelable(str, new I2(i2, intent));
            }
            NP np = NP.g;
            C0168Bx0 c0168Bx0 = new C0168Bx0(i, i2, intent);
            C0699Is0 c0699Is0 = c7.c;
            c0699Is0.getClass();
            if (c0699Is0.b(np, activity, c0168Bx0)) {
                return;
            }
            Iterator it = c0699Is0.iterator();
            while (it.hasNext()) {
                ((C0387Es0) it.next()).c(np, activity, c0168Bx0);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        C7 c7 = (C7) this.a.get();
        if (c7 != null) {
            Activity activityA = c7.a();
            if (activityA != null) {
                if (!(activityA instanceof AbstractActivityC4281i6)) {
                    Activity activityA2 = c7.a();
                    throw new IllegalStateException(AbstractC8235ym.v("Current Activity is of incorrect class, expected AppCompatActivity, received ", activityA2 != null ? activityA2.getLocalClassName() : null).toString());
                }
                VH vh = c7.o;
                vh.getClass();
                D7 d7 = (D7) vh.b;
                d7.getClass();
                C1857Xo1 c1857Xo1 = new C1857Xo1((AbstractActivityC4281i6) activityA);
                ArrayList<String> arrayList = (ArrayList) d7.a;
                O90.f(arrayList, "value");
                Bundle bundle = (Bundle) c1857Xo1.c;
                bundle.putStringArrayList("launchedKeys", arrayList);
                HashMap map = (HashMap) d7.d;
                O90.f(map, "value");
                Pair[] pairArr = (Pair[]) AbstractC7096sn0.m(map).toArray(new Pair[0]);
                bundle.putBundle("keyToRequestCode", AbstractC6262oP1.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
                HashMap map2 = (HashMap) d7.g;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    if (((ArrayList) d7.a).contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Pair[] pairArr2 = (Pair[]) AbstractC7096sn0.m(linkedHashMap).toArray(new Pair[0]);
                bundle.putBundle("keyToParamsForFallbackCallback", AbstractC6262oP1.a((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
                Bundle bundle2 = (Bundle) d7.h;
                O90.f(bundle2, "value");
                bundle.putBundle("pendingResult", bundle2);
                Random random = (Random) d7.b;
                O90.f(random, "value");
                bundle.putSerializable("random", random);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) c1857Xo1.b).edit();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeBundle(bundle);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                String strEncodeToString = Base64.encodeToString(bArrMarshall, 0);
                O90.e(strEncodeToString, "encodeToString(...)");
                editorEdit.putString("bundle", strEncodeToString);
                editorEdit.putLong("expire", new Date().getTime() + 300000);
                editorEdit.commit();
            }
            c7.c.k(NP.e);
            c7.e = true;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        C7 c7 = (C7) this.a.get();
        if (c7 != null) {
            c7.c.k(NP.d);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        C7 c7 = (C7) this.a.get();
        if (c7 != null) {
            Activity activityA = c7.a();
            if (!(activityA instanceof AbstractActivityC4281i6)) {
                Activity activityA2 = c7.a();
                throw new IllegalStateException(AbstractC8235ym.v("Current Activity is of incorrect class, expected AppCompatActivity, received ", activityA2 != null ? activityA2.getLocalClassName() : null).toString());
            }
            boolean z = c7.e;
            C0699Is0 c0699Is0 = c7.c;
            if (z) {
                c7.e = false;
                Iterator it = c0699Is0.iterator();
                while (it.hasNext()) {
                    ((C0387Es0) it.next()).b.getClass();
                }
            }
            AbstractActivityC4281i6 abstractActivityC4281i6 = (AbstractActivityC4281i6) activityA;
            VH vh = c7.o;
            vh.getClass();
            O90.f(abstractActivityC4281i6, "activity");
            C4332iN c4332iN = (C4332iN) vh.c;
            c4332iN.getClass();
            c4332iN.c = new WeakReference(abstractActivityC4281i6);
            abstractActivityC4281i6.runOnUiThread(new RunnableC6769r4(c4332iN, 2, abstractActivityC4281i6));
            c0699Is0.k(NP.c);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
        C7 c7 = (C7) this.a.get();
        if (c7 != null) {
            NP np = NP.f;
            C0699Is0 c0699Is0 = c7.c;
            c0699Is0.getClass();
            if (c0699Is0.b(np, intent, null)) {
                return;
            }
            Iterator it = c0699Is0.iterator();
            while (it.hasNext()) {
            }
        }
    }
}
