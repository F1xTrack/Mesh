package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ru.mes.dnevnik.R;

/* renamed from: fw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9431fw0 {

    /* renamed from: A */
    public final ArrayList f27476A;

    /* renamed from: a */
    public final Context f27477a;

    /* renamed from: e */
    public CharSequence f27481e;

    /* renamed from: f */
    public CharSequence f27482f;

    /* renamed from: g */
    public PendingIntent f27483g;

    /* renamed from: h */
    public IconCompat f27484h;

    /* renamed from: i */
    public int f27485i;

    /* renamed from: j */
    public int f27486j;

    /* renamed from: l */
    public boolean f27488l;

    /* renamed from: m */
    public AbstractC9559gw0 f27489m;

    /* renamed from: n */
    public CharSequence f27490n;

    /* renamed from: o */
    public String f27491o;

    /* renamed from: p */
    public boolean f27492p;

    /* renamed from: r */
    public String f27494r;

    /* renamed from: s */
    public Bundle f27495s;

    /* renamed from: v */
    public String f27498v;

    /* renamed from: w */
    public String f27499w;

    /* renamed from: x */
    public long f27500x;

    /* renamed from: y */
    public final boolean f27501y;

    /* renamed from: z */
    public final Notification f27502z;

    /* renamed from: b */
    public final ArrayList f27478b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f27479c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f27480d = new ArrayList();

    /* renamed from: k */
    public boolean f27487k = true;

    /* renamed from: q */
    public boolean f27493q = false;

    /* renamed from: t */
    public int f27496t = 0;

    /* renamed from: u */
    public int f27497u = 0;

    public C9431fw0(Context context, String str) {
        Notification notification = new Notification();
        this.f27502z = notification;
        this.f27477a = context;
        this.f27498v = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f27486j = 0;
        this.f27476A = new ArrayList();
        this.f27501y = true;
    }

    /* renamed from: b */
    public static CharSequence m18310b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final Notification m18311a() {
        String str;
        ArrayList arrayList;
        CharSequence charSequence;
        Notification notificationBuild;
        Bundle bundle;
        Bundle[] bundleArr;
        ArrayList arrayList2;
        String str2;
        C8071Oo1 c8071Oo1;
        ArrayList arrayList3;
        int i;
        ArrayList arrayList4;
        int i2;
        C8071Oo1 c8071Oo12 = new C8071Oo1();
        new ArrayList();
        c8071Oo12.f8630d = new Bundle();
        c8071Oo12.f8629c = this;
        Context context = this.f27477a;
        c8071Oo12.f8627a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            c8071Oo12.f8628b = AbstractC10199lw0.m22599a(context, this.f27498v);
        } else {
            c8071Oo12.f8628b = new Notification.Builder(this.f27477a);
        }
        Notification notification = this.f27502z;
        Context context2 = null;
        int i3 = 0;
        ((Notification.Builder) c8071Oo12.f8628b).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f27481e).setContentText(this.f27482f).setContentInfo(null).setContentIntent(this.f27483g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.f27485i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) c8071Oo12.f8628b;
        IconCompat iconCompat = this.f27484h;
        AbstractC9943jw0.m22126b(builder, iconCompat == null ? null : K50.m4556c(iconCompat, context));
        ((Notification.Builder) c8071Oo12.f8628b).setSubText(this.f27490n).setUsesChronometer(this.f27488l).setPriority(this.f27486j);
        Iterator it = this.f27478b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (!it.hasNext()) {
                break;
            }
            C8656Zv0 c8656Zv0 = (C8656Zv0) it.next();
            if (c8656Zv0.f15222b == null && (i2 = c8656Zv0.f15226f) != 0) {
                c8656Zv0.f15222b = IconCompat.m9978b(i2);
            }
            IconCompat iconCompat2 = c8656Zv0.f15222b;
            Notification.Action.Builder builderM22125a = AbstractC9943jw0.m22125a(iconCompat2 != null ? K50.m4556c(iconCompat2, context2) : context2, c8656Zv0.f15227g, c8656Zv0.f15228h);
            MQ0[] mq0Arr = c8656Zv0.f15223c;
            if (mq0Arr != null) {
                int length = mq0Arr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i4 = 0; i4 < mq0Arr.length; i4++) {
                    remoteInputArr[i4] = MQ0.m5362a(mq0Arr[i4]);
                }
                for (int i5 = 0; i5 < length; i5++) {
                    AbstractC9687hw0.m18921c(builderM22125a, remoteInputArr[i5]);
                }
            }
            Bundle bundle2 = c8656Zv0.f15221a;
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            boolean z = c8656Zv0.f15224d;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                AbstractC10071kw0.m22313a(builderM22125a, z);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i6 >= 28) {
                AbstractC10327mw0.m23020b(builderM22125a, 0);
            }
            if (i6 >= 29) {
                AbstractC10455nw0.m23283c(builderM22125a, false);
            }
            if (i6 >= 31) {
                AbstractC10583ow0.m23577a(builderM22125a, false);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", c8656Zv0.f15225e);
            AbstractC9687hw0.m18920b(builderM22125a, bundle3);
            AbstractC9687hw0.m18919a((Notification.Builder) c8071Oo12.f8628b, AbstractC9687hw0.m18922d(builderM22125a));
            context2 = null;
        }
        Bundle bundle4 = this.f27495s;
        if (bundle4 != null) {
            ((Bundle) c8071Oo12.f8630d).putAll(bundle4);
        }
        int i7 = Build.VERSION.SDK_INT;
        ((Notification.Builder) c8071Oo12.f8628b).setShowWhen(this.f27487k);
        AbstractC9687hw0.m18927i((Notification.Builder) c8071Oo12.f8628b, this.f27493q);
        AbstractC9687hw0.m18925g((Notification.Builder) c8071Oo12.f8628b, this.f27491o);
        AbstractC9687hw0.m18928j((Notification.Builder) c8071Oo12.f8628b, null);
        AbstractC9687hw0.m18926h((Notification.Builder) c8071Oo12.f8628b, this.f27492p);
        AbstractC9815iw0.m21941b((Notification.Builder) c8071Oo12.f8628b, this.f27494r);
        AbstractC9815iw0.m21942c((Notification.Builder) c8071Oo12.f8628b, this.f27496t);
        AbstractC9815iw0.m21945f((Notification.Builder) c8071Oo12.f8628b, this.f27497u);
        AbstractC9815iw0.m21943d((Notification.Builder) c8071Oo12.f8628b, null);
        AbstractC9815iw0.m21944e((Notification.Builder) c8071Oo12.f8628b, notification.sound, notification.audioAttributes);
        ArrayList arrayList5 = this.f27476A;
        ArrayList arrayList6 = this.f27479c;
        if (i7 < 28) {
            if (arrayList6 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList(arrayList6.size());
                Iterator it2 = arrayList6.iterator();
                if (it2.hasNext()) {
                    throw AbstractC7222ym.m26227d(it2);
                }
            }
            if (arrayList4 != null) {
                if (arrayList5 == null) {
                    arrayList5 = arrayList4;
                } else {
                    C0135C8 c0135c8 = new C0135C8(arrayList5.size() + arrayList4.size());
                    c0135c8.addAll(arrayList4);
                    c0135c8.addAll(arrayList5);
                    arrayList5 = new ArrayList(c0135c8);
                }
            }
        }
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                AbstractC9815iw0.m21940a((Notification.Builder) c8071Oo12.f8628b, (String) it3.next());
            }
        }
        ArrayList arrayList7 = this.f27480d;
        if (arrayList7.size() > 0) {
            if (this.f27495s == null) {
                this.f27495s = new Bundle();
            }
            Bundle bundle5 = this.f27495s.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList7.size()) {
                String string = Integer.toString(i8);
                C8656Zv0 c8656Zv02 = (C8656Zv0) arrayList7.get(i8);
                Bundle bundle8 = new Bundle();
                if (c8656Zv02.f15222b == null && (i = c8656Zv02.f15226f) != 0) {
                    c8656Zv02.f15222b = IconCompat.m9978b(i);
                }
                IconCompat iconCompat3 = c8656Zv02.f15222b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.m9979c() : i3);
                bundle8.putCharSequence("title", c8656Zv02.f15227g);
                bundle8.putParcelable("actionIntent", c8656Zv02.f15228h);
                Bundle bundle9 = c8656Zv02.f15221a;
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean(str, c8656Zv02.f15224d);
                bundle8.putBundle("extras", bundle10);
                MQ0[] mq0Arr2 = c8656Zv02.f15223c;
                if (mq0Arr2 == null) {
                    c8071Oo1 = c8071Oo12;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList6;
                    str2 = str;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[mq0Arr2.length];
                    arrayList2 = arrayList7;
                    str2 = str;
                    int i9 = 0;
                    while (i9 < mq0Arr2.length) {
                        MQ0 mq0 = mq0Arr2[i9];
                        MQ0[] mq0Arr3 = mq0Arr2;
                        Bundle bundle11 = new Bundle();
                        mq0.getClass();
                        ArrayList arrayList8 = arrayList6;
                        C8071Oo1 c8071Oo13 = c8071Oo12;
                        bundle11.putString("resultKey", RNPushNotification.KEY_TEXT_REPLY);
                        bundle11.putCharSequence("label", mq0.f7154a);
                        bundle11.putCharSequenceArray("choices", null);
                        bundle11.putBoolean("allowFreeFormInput", true);
                        bundle11.putBundle("extras", mq0.f7155b);
                        HashSet hashSet = mq0.f7156c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList9 = new ArrayList<>(hashSet.size());
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add((String) it4.next());
                            }
                            bundle11.putStringArrayList("allowedDataTypes", arrayList9);
                        }
                        bundleArr[i9] = bundle11;
                        i9++;
                        mq0Arr2 = mq0Arr3;
                        arrayList6 = arrayList8;
                        c8071Oo12 = c8071Oo13;
                    }
                    c8071Oo1 = c8071Oo12;
                    arrayList3 = arrayList6;
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", c8656Zv02.f15225e);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i8++;
                arrayList7 = arrayList2;
                str = str2;
                arrayList6 = arrayList3;
                c8071Oo12 = c8071Oo1;
                i3 = 0;
            }
            C8071Oo1 c8071Oo14 = c8071Oo12;
            arrayList = arrayList6;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f27495s == null) {
                this.f27495s = new Bundle();
            }
            this.f27495s.putBundle("android.car.EXTENSIONS", bundle5);
            c8071Oo12 = c8071Oo14;
            ((Bundle) c8071Oo12.f8630d).putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            arrayList = arrayList6;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            ((Notification.Builder) c8071Oo12.f8628b).setExtras(this.f27495s);
            charSequence = null;
            AbstractC10071kw0.m22317e((Notification.Builder) c8071Oo12.f8628b, null);
        } else {
            charSequence = null;
        }
        if (i10 >= 26) {
            AbstractC10199lw0.m22600b((Notification.Builder) c8071Oo12.f8628b, 0);
            AbstractC10199lw0.m22603e((Notification.Builder) c8071Oo12.f8628b, charSequence);
            AbstractC10199lw0.m22604f((Notification.Builder) c8071Oo12.f8628b, this.f27499w);
            AbstractC10199lw0.m22605g((Notification.Builder) c8071Oo12.f8628b, this.f27500x);
            AbstractC10199lw0.m22602d((Notification.Builder) c8071Oo12.f8628b, 0);
            if (!TextUtils.isEmpty(this.f27498v)) {
                ((Notification.Builder) c8071Oo12.f8628b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            Iterator it5 = arrayList.iterator();
            if (it5.hasNext()) {
                throw AbstractC7222ym.m26227d(it5);
            }
        }
        if (i10 >= 29) {
            AbstractC10455nw0.m23281a((Notification.Builder) c8071Oo12.f8628b, this.f27501y);
            AbstractC10455nw0.m23282b((Notification.Builder) c8071Oo12.f8628b, null);
        }
        C9431fw0 c9431fw0 = (C9431fw0) c8071Oo12.f8629c;
        AbstractC9559gw0 abstractC9559gw0 = c9431fw0.f27489m;
        if (abstractC9559gw0 != null) {
            abstractC9559gw0.mo17436a(c8071Oo12);
        }
        int i11 = Build.VERSION.SDK_INT;
        Notification.Builder builder2 = (Notification.Builder) c8071Oo12.f8628b;
        if (i11 < 26 && i11 < 24) {
            builder2.setExtras((Bundle) c8071Oo12.f8630d);
            notificationBuild = builder2.build();
        } else {
            notificationBuild = builder2.build();
        }
        if (abstractC9559gw0 != null) {
            c9431fw0.f27489m.getClass();
        }
        if (abstractC9559gw0 != null && (bundle = notificationBuild.extras) != null) {
            if (abstractC9559gw0.f28104a) {
                bundle.putCharSequence("android.summaryText", (CharSequence) abstractC9559gw0.f28107d);
            }
            CharSequence charSequence2 = (CharSequence) abstractC9559gw0.f28106c;
            if (charSequence2 != null) {
                bundle.putCharSequence("android.title.big", charSequence2);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", abstractC9559gw0.mo17437d());
        }
        return notificationBuild;
    }

    /* renamed from: c */
    public final void m18312c() {
        this.f27494r = "call";
    }

    /* renamed from: d */
    public final void m18313d(int i) {
        this.f27496t = i;
    }

    /* renamed from: e */
    public final void m18314e(PendingIntent pendingIntent) {
        this.f27483g = pendingIntent;
    }

    /* renamed from: f */
    public final void m18315f(int i) {
        Notification notification = this.f27502z;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    /* renamed from: g */
    public final void m18316g(int i, boolean z) {
        Notification notification = this.f27502z;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    /* renamed from: h */
    public final void m18317h(String str) {
        this.f27491o = str;
    }

    /* renamed from: i */
    public final void m18318i(boolean z) {
        this.f27492p = z;
    }

    /* renamed from: j */
    public final void m18319j(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f27477a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f16096k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f16098b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f27484h = iconCompat;
    }

    /* renamed from: k */
    public final void m18320k(int i) {
        this.f27485i = i;
    }

    /* renamed from: l */
    public final void m18321l(boolean z) {
        m18316g(2, z);
    }

    /* renamed from: m */
    public final void m18322m(boolean z) {
        m18316g(8, z);
    }

    /* renamed from: n */
    public final void m18323n(int i) {
        this.f27486j = i;
    }

    /* renamed from: o */
    public final void m18324o(String str) {
        this.f27499w = str;
    }

    /* renamed from: p */
    public final void m18325p(boolean z) {
        this.f27487k = z;
    }

    /* renamed from: q */
    public final void m18326q(int i) {
        this.f27502z.icon = i;
    }

    /* renamed from: r */
    public final void m18327r(Uri uri) {
        Notification notification = this.f27502z;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = AbstractC9303ew0.m18077a(AbstractC9303ew0.m18081e(AbstractC9303ew0.m18079c(AbstractC9303ew0.m18078b(), 4), 5));
    }

    /* renamed from: s */
    public final void m18328s(AbstractC9559gw0 abstractC9559gw0) {
        if (this.f27489m != abstractC9559gw0) {
            this.f27489m = abstractC9559gw0;
            if (((C9431fw0) abstractC9559gw0.f28105b) != this) {
                abstractC9559gw0.f28105b = this;
                m18328s(abstractC9559gw0);
            }
        }
    }

    /* renamed from: t */
    public final void m18329t(long[] jArr) {
        this.f27502z.vibrate = jArr;
    }

    /* renamed from: u */
    public final void m18330u(int i) {
        this.f27497u = i;
    }
}
