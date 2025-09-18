package p000;

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

/* renamed from: D7 */
/* loaded from: classes2.dex */
public final class C0197D7 {

    /* renamed from: a */
    public Object f1846a;

    /* renamed from: b */
    public Object f1847b;

    /* renamed from: c */
    public Object f1848c;

    /* renamed from: d */
    public Object f1849d;

    /* renamed from: e */
    public Object f1850e;

    /* renamed from: f */
    public Object f1851f;

    /* renamed from: g */
    public Object f1852g;

    /* renamed from: h */
    public Object f1853h;

    public C0197D7(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC9900ja1.m22074c(context, R.attr.materialCalendarStyle, C8898bo0.class.getCanonicalName()).data, NG0.f7701o);
        this.f1847b = C4218i3.m18936e(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f1846a = C4218i3.m18936e(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f1848c = C4218i3.m18936e(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f1849d = C4218i3.m18936e(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM7406e = AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 7);
        this.f1850e = C4218i3.m18936e(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f1851f = C4218i3.m18936e(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f1852g = C4218i3.m18936e(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f1853h = paint;
        paint.setColor(colorStateListM7406e.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0049  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.InterfaceC6380li m1558a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1849d
            li r0 = (p000.InterfaceC6380li) r0
            if (r0 != 0) goto L97
            java.lang.Object r0 = r6.f1847b
            dC0 r0 = (p000.C9083dC0) r0
            java.lang.String r1 = r0.f25865i
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
            Fv0 r2 = r0.f25858b
            Ev0 r4 = r0.f25860d
            if (r1 == r3) goto L60
            jj r1 = new jj
            eC0 r0 = r0.f25857a
            r1.<init>(r4, r0, r2)
            r6.f1849d = r1
            goto L97
        L60:
            jj r0 = new jj
            eC0 r1 = p000.AbstractC1084RE.m6923a()
            r0.<init>(r4, r1, r2)
            r6.f1849d = r0
            goto L97
        L6c:
            J9 r1 = new J9
            Fv0 r2 = p000.C7616Fv0.m2825u()
            int r0 = r0.f25866j
            r1.<init>()
            CC0 r3 = new CC0
            r4 = 6
            r3.<init>(r4)
            r1.f5359c = r3
            r1.f5357a = r0
            r1.f5360d = r2
            r6.f1849d = r1
            goto L97
        L86:
            G10 r0 = new G10
            r1 = 14
            r0.<init>(r1)
            r6.f1849d = r0
            goto L97
        L90:
            nM r0 = new nM
            r0.<init>()
            r6.f1849d = r0
        L97:
            java.lang.Object r0 = r6.f1849d
            li r0 = (p000.InterfaceC6380li) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0197D7.m1558a():li");
    }

    /* renamed from: b */
    public C1339VH m1559b(int i) {
        AbstractC10955rq0 abstractC10955rq0;
        if (((C1339VH) this.f1852g) == null) {
            C9083dC0 c9083dC0 = (C9083dC0) this.f1847b;
            C7616Fv0 c7616Fv0 = c9083dC0.f25862f;
            C9211eC0 c9211eC0 = c9083dC0.f25861e;
            C7564Ev0 c7564Ev0 = c9083dC0.f25860d;
            if (i == 0) {
                if (((AbstractC10955rq0) this.f1851f) == null) {
                    try {
                        this.f1851f = (AbstractC10955rq0) NativeMemoryChunkPool.class.getConstructor(InterfaceC11848yq0.class, C9211eC0.class, InterfaceC9339fC0.class).newInstance(c7564Ev0, c9211eC0, c7616Fv0);
                    } catch (ClassNotFoundException unused) {
                        AbstractC3929dS.m17675h("PoolFactory");
                        this.f1851f = null;
                    } catch (IllegalAccessException unused2) {
                        AbstractC3929dS.m17675h("PoolFactory");
                        this.f1851f = null;
                    } catch (InstantiationException unused3) {
                        AbstractC3929dS.m17675h("PoolFactory");
                        this.f1851f = null;
                    } catch (NoSuchMethodException unused4) {
                        AbstractC3929dS.m17675h("PoolFactory");
                        this.f1851f = null;
                    } catch (InvocationTargetException unused5) {
                        AbstractC3929dS.m17675h("PoolFactory");
                        this.f1851f = null;
                    }
                }
                abstractC10955rq0 = (AbstractC10955rq0) this.f1851f;
            } else if (i == 1) {
                if (((AbstractC10955rq0) this.f1850e) == null) {
                    try {
                        this.f1850e = (AbstractC10955rq0) BufferMemoryChunkPool.class.getConstructor(InterfaceC11848yq0.class, C9211eC0.class, InterfaceC9339fC0.class).newInstance(c7564Ev0, c9211eC0, c7616Fv0);
                    } catch (ClassNotFoundException unused6) {
                        this.f1850e = null;
                    } catch (IllegalAccessException unused7) {
                        this.f1850e = null;
                    } catch (InstantiationException unused8) {
                        this.f1850e = null;
                    } catch (NoSuchMethodException unused9) {
                        this.f1850e = null;
                    } catch (InvocationTargetException unused10) {
                        this.f1850e = null;
                    }
                }
                abstractC10955rq0 = (AbstractC10955rq0) this.f1850e;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
                if (((AbstractC10955rq0) this.f1848c) == null) {
                    try {
                        this.f1848c = (AbstractC10955rq0) AshmemMemoryChunkPool.class.getConstructor(InterfaceC11848yq0.class, C9211eC0.class, InterfaceC9339fC0.class).newInstance(c7564Ev0, c9211eC0, c7616Fv0);
                    } catch (ClassNotFoundException unused11) {
                        this.f1848c = null;
                    } catch (IllegalAccessException unused12) {
                        this.f1848c = null;
                    } catch (InstantiationException unused13) {
                        this.f1848c = null;
                    } catch (NoSuchMethodException unused14) {
                        this.f1848c = null;
                    } catch (InvocationTargetException unused15) {
                        this.f1848c = null;
                    }
                }
                abstractC10955rq0 = (AbstractC10955rq0) this.f1848c;
            }
            ML1.m5337d(abstractC10955rq0, "failed to get pool for chunk type: " + i);
            this.f1852g = new C1339VH(abstractC10955rq0, m1560c());
        }
        return (C1339VH) this.f1852g;
    }

    /* renamed from: c */
    public C0986Pf m1560c() {
        if (((C0986Pf) this.f1846a) == null) {
            if (((E00) this.f1853h) == null) {
                C9083dC0 c9083dC0 = (C9083dC0) this.f1847b;
                this.f1853h = new E00(c9083dC0.f25860d, c9083dC0.f25863g, c9083dC0.f25864h);
            }
            this.f1846a = new C0986Pf((E00) this.f1853h);
        }
        return (C0986Pf) this.f1846a;
    }

    /* renamed from: d */
    public void m1561d(AbstractActivityC4221i6 abstractActivityC4221i6) {
        LinkedHashMap linkedHashMap;
        F71 f71 = (F71) new C8539Xo1(abstractActivityC4221i6).f13983d;
        ArrayList<String> stringArrayList = ((Bundle) f71.getValue()).getStringArrayList("launchedKeys");
        if (stringArrayList != null) {
            this.f1846a = stringArrayList;
        }
        Bundle bundle = ((Bundle) f71.getValue()).getBundle("keyToParamsForFallbackCallback");
        LinkedHashMap linkedHashMap2 = null;
        if (bundle != null) {
            Set<String> setKeySet = bundle.keySet();
            O90.m5967e(setKeySet, "keySet(...)");
            int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(setKeySet));
            if (iM24983b < 16) {
                iM24983b = 16;
            }
            linkedHashMap = new LinkedHashMap(iM24983b);
            for (Object obj : setKeySet) {
                String str = (String) obj;
                Serializable serializable = Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable(str, Serializable.class) : bundle.getSerializable(str);
                if (serializable == null) {
                    throw new IllegalStateException(AbstractC7222ym.m26234k("For a key '", str, "' there should be a serializable class available"));
                }
                linkedHashMap.put(obj, serializable);
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            ((HashMap) this.f1852g).putAll(linkedHashMap);
        }
        Bundle bundle2 = ((Bundle) f71.getValue()).getBundle("pendingResult");
        if (bundle2 != null) {
            ((Bundle) this.f1853h).putAll(bundle2);
        }
        Bundle bundle3 = (Bundle) f71.getValue();
        Serializable serializable2 = Build.VERSION.SDK_INT >= 33 ? bundle3.getSerializable("random", Serializable.class) : bundle3.getSerializable("random");
        if (serializable2 != null) {
            this.f1847b = (Random) serializable2;
        }
        Bundle bundle4 = ((Bundle) f71.getValue()).getBundle("keyToRequestCode");
        if (bundle4 != null) {
            Set<String> setKeySet2 = bundle4.keySet();
            O90.m5965c(setKeySet2);
            int iM24983b2 = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(setKeySet2));
            linkedHashMap2 = new LinkedHashMap(iM24983b2 >= 16 ? iM24983b2 : 16);
            for (Object obj2 : setKeySet2) {
                linkedHashMap2.put(obj2, Integer.valueOf(bundle4.getInt((String) obj2)));
            }
        }
        if (linkedHashMap2 != null) {
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                String str2 = (String) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                ((HashMap) this.f1849d).put(str2, Integer.valueOf(iIntValue));
                ((HashMap) this.f1848c).put(Integer.valueOf(iIntValue), str2);
            }
        }
    }
}
