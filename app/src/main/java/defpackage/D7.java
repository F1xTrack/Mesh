package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import ru.mes.dnevnik.R;

/* loaded from: classes2.dex */
public final class D7 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public D7(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC5340ja1.c(context, R.attr.materialCalendarStyle, C2394bo0.class.getCanonicalName()).data, NG0.o);
        this.b = C4271i3.e(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.a = C4271i3.e(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.c = C4271i3.e(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.d = C4271i3.e(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListE = AbstractC1437Se1.e(context, typedArrayObtainStyledAttributes, 7);
        this.e = C4271i3.e(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f = C4271i3.e(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.g = C4271i3.e(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListE.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.InterfaceC5744li a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            li r0 = (defpackage.InterfaceC5744li) r0
            if (r0 != 0) goto L97
            java.lang.Object r0 = r6.b
            dC0 r0 = (defpackage.C3346dC0) r0
            java.lang.String r1 = r0.i
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -1868884870: goto L3f;
                case -1106578487: goto L35;
                case -404562712: goto L2b;
                case -402149703: goto L21;
                case 95945896: goto L17;
                default: goto L16;
            }
        L16:
            goto L49
        L17:
            java.lang.String r2 = "dummy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            r1 = 0
            goto L4a
        L21:
            java.lang.String r2 = "dummy_with_tracking"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            r1 = r5
            goto L4a
        L2b:
            java.lang.String r2 = "experimental"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            r1 = r4
            goto L4a
        L35:
            java.lang.String r2 = "legacy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            r1 = 4
            goto L4a
        L3f:
            java.lang.String r2 = "legacy_default_params"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            r1 = r3
            goto L4a
        L49:
            r1 = -1
        L4a:
            if (r1 == 0) goto L90
            if (r1 == r5) goto L86
            if (r1 == r4) goto L6c
            Fv0 r2 = r0.b
            Ev0 r4 = r0.d
            if (r1 == r3) goto L60
            jj r1 = new jj
            eC0 r0 = r0.a
            r1.<init>(r4, r0, r2)
            r6.d = r1
            goto L97
        L60:
            jj r0 = new jj
            eC0 r1 = defpackage.RE.a()
            r0.<init>(r4, r1, r2)
            r6.d = r0
            goto L97
        L6c:
            J9 r1 = new J9
            Fv0 r2 = defpackage.C0474Fv0.u()
            int r0 = r0.j
            r1.<init>()
            CC0 r3 = new CC0
            r4 = 6
            r3.<init>(r4)
            r1.c = r3
            r1.a = r0
            r1.d = r2
            r6.d = r1
            goto L97
        L86:
            G10 r0 = new G10
            r1 = 14
            r0.<init>(r1)
            r6.d = r0
            goto L97
        L90:
            nM r0 = new nM
            r0.<init>()
            r6.d = r0
        L97:
            java.lang.Object r0 = r6.d
            li r0 = (defpackage.InterfaceC5744li) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.D7.a():li");
    }

    public VH b(int i) {
        AbstractC6914rq0 abstractC6914rq0;
        if (((VH) this.g) == null) {
            C3346dC0 c3346dC0 = (C3346dC0) this.b;
            C0474Fv0 c0474Fv0 = c3346dC0.f;
            C3536eC0 c3536eC0 = c3346dC0.e;
            C0396Ev0 c0396Ev0 = c3346dC0.d;
            if (i == 0) {
                if (((AbstractC6914rq0) this.f) == null) {
                    try {
                        this.f = (AbstractC6914rq0) NativeMemoryChunkPool.class.getConstructor(InterfaceC8248yq0.class, C3536eC0.class, InterfaceC3727fC0.class).newInstance(c0396Ev0, c3536eC0, c0474Fv0);
                    } catch (ClassNotFoundException unused) {
                        AbstractC3393dS.h("PoolFactory");
                        this.f = null;
                    } catch (IllegalAccessException unused2) {
                        AbstractC3393dS.h("PoolFactory");
                        this.f = null;
                    } catch (InstantiationException unused3) {
                        AbstractC3393dS.h("PoolFactory");
                        this.f = null;
                    } catch (NoSuchMethodException unused4) {
                        AbstractC3393dS.h("PoolFactory");
                        this.f = null;
                    } catch (InvocationTargetException unused5) {
                        AbstractC3393dS.h("PoolFactory");
                        this.f = null;
                    }
                }
                abstractC6914rq0 = (AbstractC6914rq0) this.f;
            } else if (i == 1) {
                if (((AbstractC6914rq0) this.e) == null) {
                    try {
                        this.e = (AbstractC6914rq0) BufferMemoryChunkPool.class.getConstructor(InterfaceC8248yq0.class, C3536eC0.class, InterfaceC3727fC0.class).newInstance(c0396Ev0, c3536eC0, c0474Fv0);
                    } catch (ClassNotFoundException unused6) {
                        this.e = null;
                    } catch (IllegalAccessException unused7) {
                        this.e = null;
                    } catch (InstantiationException unused8) {
                        this.e = null;
                    } catch (NoSuchMethodException unused9) {
                        this.e = null;
                    } catch (InvocationTargetException unused10) {
                        this.e = null;
                    }
                }
                abstractC6914rq0 = (AbstractC6914rq0) this.e;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
                if (((AbstractC6914rq0) this.c) == null) {
                    try {
                        this.c = (AbstractC6914rq0) AshmemMemoryChunkPool.class.getConstructor(InterfaceC8248yq0.class, C3536eC0.class, InterfaceC3727fC0.class).newInstance(c0396Ev0, c3536eC0, c0474Fv0);
                    } catch (ClassNotFoundException unused11) {
                        this.c = null;
                    } catch (IllegalAccessException unused12) {
                        this.c = null;
                    } catch (InstantiationException unused13) {
                        this.c = null;
                    } catch (NoSuchMethodException unused14) {
                        this.c = null;
                    } catch (InvocationTargetException unused15) {
                        this.c = null;
                    }
                }
                abstractC6914rq0 = (AbstractC6914rq0) this.c;
            }
            ML1.d(abstractC6914rq0, "failed to get pool for chunk type: " + i);
            this.g = new VH(abstractC6914rq0, c());
        }
        return (VH) this.g;
    }

    public C1204Pf c() {
        if (((C1204Pf) this.a) == null) {
            if (((E00) this.h) == null) {
                C3346dC0 c3346dC0 = (C3346dC0) this.b;
                this.h = new E00(c3346dC0.d, c3346dC0.g, c3346dC0.h);
            }
            this.a = new C1204Pf((E00) this.h);
        }
        return (C1204Pf) this.a;
    }

    public void d(AbstractActivityC4281i6 abstractActivityC4281i6) {
        LinkedHashMap linkedHashMap;
        F71 f71 = (F71) new C1857Xo1(abstractActivityC4281i6).d;
        ArrayList<String> stringArrayList = ((Bundle) f71.getValue()).getStringArrayList("launchedKeys");
        if (stringArrayList != null) {
            this.a = stringArrayList;
        }
        Bundle bundle = ((Bundle) f71.getValue()).getBundle("keyToParamsForFallbackCallback");
        LinkedHashMap linkedHashMap2 = null;
        if (bundle != null) {
            Set<String> setKeySet = bundle.keySet();
            O90.e(setKeySet, "keySet(...)");
            int iB = AbstractC7287tn0.b(AbstractC8449zu.k(setKeySet));
            if (iB < 16) {
                iB = 16;
            }
            linkedHashMap = new LinkedHashMap(iB);
            for (Object obj : setKeySet) {
                String str = (String) obj;
                Serializable serializable = Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable(str, Serializable.class) : bundle.getSerializable(str);
                if (serializable == null) {
                    throw new IllegalStateException(AbstractC8235ym.k("For a key '", str, "' there should be a serializable class available"));
                }
                linkedHashMap.put(obj, serializable);
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            ((HashMap) this.g).putAll(linkedHashMap);
        }
        Bundle bundle2 = ((Bundle) f71.getValue()).getBundle("pendingResult");
        if (bundle2 != null) {
            ((Bundle) this.h).putAll(bundle2);
        }
        Bundle bundle3 = (Bundle) f71.getValue();
        Serializable serializable2 = Build.VERSION.SDK_INT >= 33 ? bundle3.getSerializable("random", Serializable.class) : bundle3.getSerializable("random");
        if (serializable2 != null) {
            this.b = (Random) serializable2;
        }
        Bundle bundle4 = ((Bundle) f71.getValue()).getBundle("keyToRequestCode");
        if (bundle4 != null) {
            Set<String> setKeySet2 = bundle4.keySet();
            O90.c(setKeySet2);
            int iB2 = AbstractC7287tn0.b(AbstractC8449zu.k(setKeySet2));
            linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
            for (Object obj2 : setKeySet2) {
                linkedHashMap2.put(obj2, Integer.valueOf(bundle4.getInt((String) obj2)));
            }
        }
        if (linkedHashMap2 != null) {
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                String str2 = (String) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                ((HashMap) this.d).put(str2, Integer.valueOf(iIntValue));
                ((HashMap) this.c).put(Integer.valueOf(iIntValue), str2);
            }
        }
    }
}
