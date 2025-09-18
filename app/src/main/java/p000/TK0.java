package p000;

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

    /* renamed from: a */
    public final WeakReference f11325a;

    public TK0(C0134C7 c0134c7) {
        O90.m5968f(c0134c7, "appContext");
        this.f11325a = new WeakReference(c0134c7);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        O90.m5968f(activity, "activity");
        C0134C7 c0134c7 = (C0134C7) this.f11325a.get();
        if (c0134c7 != null) {
            C0197D7 c0197d7 = (C0197D7) c0134c7.f1210o.f12486b;
            String str = (String) ((HashMap) c0197d7.f1848c).get(Integer.valueOf(i));
            if (str != null) {
                if (((HashMap) c0197d7.f1851f).get(str) != null) {
                    throw new ClassCastException();
                }
                if (((HashMap) c0197d7.f1850e).get(str) != null) {
                    throw new ClassCastException();
                }
                ((Bundle) c0197d7.f1853h).putParcelable(str, new C0507I2(i2, intent));
            }
            EnumC0844NP enumC0844NP = EnumC0844NP.f7760g;
            C7412Bx0 c7412Bx0 = new C7412Bx0(i, i2, intent);
            C7766Is0 c7766Is0 = c0134c7.f1198c;
            c7766Is0.getClass();
            if (c7766Is0.m4058b(enumC0844NP, activity, c7412Bx0)) {
                return;
            }
            Iterator it = c7766Is0.iterator();
            while (it.hasNext()) {
                ((C7558Es0) it.next()).m2438c(enumC0844NP, activity, c7412Bx0);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        C0134C7 c0134c7 = (C0134C7) this.f11325a.get();
        if (c0134c7 != null) {
            Activity activityM985a = c0134c7.m985a();
            if (activityM985a != null) {
                if (!(activityM985a instanceof AbstractActivityC4221i6)) {
                    Activity activityM985a2 = c0134c7.m985a();
                    throw new IllegalStateException(AbstractC7222ym.m26245v("Current Activity is of incorrect class, expected AppCompatActivity, received ", activityM985a2 != null ? activityM985a2.getLocalClassName() : null).toString());
                }
                C1339VH c1339vh = c0134c7.f1210o;
                c1339vh.getClass();
                C0197D7 c0197d7 = (C0197D7) c1339vh.f12486b;
                c0197d7.getClass();
                C8539Xo1 c8539Xo1 = new C8539Xo1((AbstractActivityC4221i6) activityM985a);
                ArrayList<String> arrayList = (ArrayList) c0197d7.f1846a;
                O90.m5968f(arrayList, "value");
                Bundle bundle = (Bundle) c8539Xo1.f13982c;
                bundle.putStringArrayList("launchedKeys", arrayList);
                HashMap map = (HashMap) c0197d7.f1849d;
                O90.m5968f(map, "value");
                Pair[] pairArr = (Pair[]) AbstractC11077sn0.m24785m(map).toArray(new Pair[0]);
                bundle.putBundle("keyToRequestCode", AbstractC10518oP1.m23391a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
                HashMap map2 = (HashMap) c0197d7.f1852g;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    if (((ArrayList) c0197d7.f1846a).contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Pair[] pairArr2 = (Pair[]) AbstractC11077sn0.m24785m(linkedHashMap).toArray(new Pair[0]);
                bundle.putBundle("keyToParamsForFallbackCallback", AbstractC10518oP1.m23391a((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
                Bundle bundle2 = (Bundle) c0197d7.f1853h;
                O90.m5968f(bundle2, "value");
                bundle.putBundle("pendingResult", bundle2);
                Random random = (Random) c0197d7.f1847b;
                O90.m5968f(random, "value");
                bundle.putSerializable("random", random);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) c8539Xo1.f13981b).edit();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeBundle(bundle);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                String strEncodeToString = Base64.encodeToString(bArrMarshall, 0);
                O90.m5967e(strEncodeToString, "encodeToString(...)");
                editorEdit.putString("bundle", strEncodeToString);
                editorEdit.putLong("expire", new Date().getTime() + 300000);
                editorEdit.commit();
            }
            c0134c7.f1198c.m4061k(EnumC0844NP.f7758e);
            c0134c7.f1200e = true;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        C0134C7 c0134c7 = (C0134C7) this.f11325a.get();
        if (c0134c7 != null) {
            c0134c7.f1198c.m4061k(EnumC0844NP.f7757d);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        C0134C7 c0134c7 = (C0134C7) this.f11325a.get();
        if (c0134c7 != null) {
            Activity activityM985a = c0134c7.m985a();
            if (!(activityM985a instanceof AbstractActivityC4221i6)) {
                Activity activityM985a2 = c0134c7.m985a();
                throw new IllegalStateException(AbstractC7222ym.m26245v("Current Activity is of incorrect class, expected AppCompatActivity, received ", activityM985a2 != null ? activityM985a2.getLocalClassName() : null).toString());
            }
            boolean z = c0134c7.f1200e;
            C7766Is0 c7766Is0 = c0134c7.f1198c;
            if (z) {
                c0134c7.f1200e = false;
                Iterator it = c7766Is0.iterator();
                while (it.hasNext()) {
                    ((C7558Es0) it.next()).f2934b.getClass();
                }
            }
            AbstractActivityC4221i6 abstractActivityC4221i6 = (AbstractActivityC4221i6) activityM985a;
            C1339VH c1339vh = c0134c7.f1210o;
            c1339vh.getClass();
            O90.m5968f(abstractActivityC4221i6, "activity");
            C4238iN c4238iN = (C4238iN) c1339vh.f12487c;
            c4238iN.getClass();
            c4238iN.f29114c = new WeakReference(abstractActivityC4221i6);
            abstractActivityC4221i6.runOnUiThread(new RunnableC6720r4(c4238iN, 2, abstractActivityC4221i6));
            c7766Is0.m4061k(EnumC0844NP.f7756c);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
        C0134C7 c0134c7 = (C0134C7) this.f11325a.get();
        if (c0134c7 != null) {
            EnumC0844NP enumC0844NP = EnumC0844NP.f7759f;
            C7766Is0 c7766Is0 = c0134c7.f1198c;
            c7766Is0.getClass();
            if (c7766Is0.m4058b(enumC0844NP, intent, null)) {
                return;
            }
            Iterator it = c7766Is0.iterator();
            while (it.hasNext()) {
            }
        }
    }
}
