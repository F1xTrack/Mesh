package defpackage;

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
public final class C3865fw0 {
    public final ArrayList A;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean l;
    public AbstractC4056gw0 m;
    public CharSequence n;
    public String o;
    public boolean p;
    public String r;
    public Bundle s;
    public String v;
    public String w;
    public long x;
    public final boolean y;
    public final Notification z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean q = false;
    public int t = 0;
    public int u = 0;

    public C3865fw0(Context context, String str) {
        Notification notification = new Notification();
        this.z = notification;
        this.a = context;
        this.v = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.A = new ArrayList();
        this.y = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification a() {
        String str;
        ArrayList arrayList;
        CharSequence charSequence;
        Notification notificationBuild;
        Bundle bundle;
        Bundle[] bundleArr;
        ArrayList arrayList2;
        String str2;
        C1155Oo1 c1155Oo1;
        ArrayList arrayList3;
        int i;
        ArrayList arrayList4;
        int i2;
        C1155Oo1 c1155Oo12 = new C1155Oo1();
        new ArrayList();
        c1155Oo12.d = new Bundle();
        c1155Oo12.c = this;
        Context context = this.a;
        c1155Oo12.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            c1155Oo12.b = AbstractC5787lw0.a(context, this.v);
        } else {
            c1155Oo12.b = new Notification.Builder(this.a);
        }
        Notification notification = this.z;
        Context context2 = null;
        int i3 = 0;
        ((Notification.Builder) c1155Oo12.b).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) c1155Oo12.b;
        IconCompat iconCompat = this.h;
        AbstractC5405jw0.b(builder, iconCompat == null ? null : K50.c(iconCompat, context));
        ((Notification.Builder) c1155Oo12.b).setSubText(this.n).setUsesChronometer(this.l).setPriority(this.j);
        Iterator it = this.b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (!it.hasNext()) {
                break;
            }
            C2033Zv0 c2033Zv0 = (C2033Zv0) it.next();
            if (c2033Zv0.b == null && (i2 = c2033Zv0.f) != 0) {
                c2033Zv0.b = IconCompat.b(i2);
            }
            IconCompat iconCompat2 = c2033Zv0.b;
            Notification.Action.Builder builderA = AbstractC5405jw0.a(iconCompat2 != null ? K50.c(iconCompat2, context2) : context2, c2033Zv0.g, c2033Zv0.h);
            MQ0[] mq0Arr = c2033Zv0.c;
            if (mq0Arr != null) {
                int length = mq0Arr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i4 = 0; i4 < mq0Arr.length; i4++) {
                    remoteInputArr[i4] = MQ0.a(mq0Arr[i4]);
                }
                for (int i5 = 0; i5 < length; i5++) {
                    AbstractC4247hw0.c(builderA, remoteInputArr[i5]);
                }
            }
            Bundle bundle2 = c2033Zv0.a;
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            boolean z = c2033Zv0.d;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                AbstractC5596kw0.a(builderA, z);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i6 >= 28) {
                AbstractC5978mw0.b(builderA, 0);
            }
            if (i6 >= 29) {
                AbstractC6169nw0.c(builderA, false);
            }
            if (i6 >= 31) {
                AbstractC6360ow0.a(builderA, false);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", c2033Zv0.e);
            AbstractC4247hw0.b(builderA, bundle3);
            AbstractC4247hw0.a((Notification.Builder) c1155Oo12.b, AbstractC4247hw0.d(builderA));
            context2 = null;
        }
        Bundle bundle4 = this.s;
        if (bundle4 != null) {
            ((Bundle) c1155Oo12.d).putAll(bundle4);
        }
        int i7 = Build.VERSION.SDK_INT;
        ((Notification.Builder) c1155Oo12.b).setShowWhen(this.k);
        AbstractC4247hw0.i((Notification.Builder) c1155Oo12.b, this.q);
        AbstractC4247hw0.g((Notification.Builder) c1155Oo12.b, this.o);
        AbstractC4247hw0.j((Notification.Builder) c1155Oo12.b, null);
        AbstractC4247hw0.h((Notification.Builder) c1155Oo12.b, this.p);
        AbstractC5214iw0.b((Notification.Builder) c1155Oo12.b, this.r);
        AbstractC5214iw0.c((Notification.Builder) c1155Oo12.b, this.t);
        AbstractC5214iw0.f((Notification.Builder) c1155Oo12.b, this.u);
        AbstractC5214iw0.d((Notification.Builder) c1155Oo12.b, null);
        AbstractC5214iw0.e((Notification.Builder) c1155Oo12.b, notification.sound, notification.audioAttributes);
        ArrayList arrayList5 = this.A;
        ArrayList arrayList6 = this.c;
        if (i7 < 28) {
            if (arrayList6 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList(arrayList6.size());
                Iterator it2 = arrayList6.iterator();
                if (it2.hasNext()) {
                    throw AbstractC8235ym.d(it2);
                }
            }
            if (arrayList4 != null) {
                if (arrayList5 == null) {
                    arrayList5 = arrayList4;
                } else {
                    C8 c8 = new C8(arrayList5.size() + arrayList4.size());
                    c8.addAll(arrayList4);
                    c8.addAll(arrayList5);
                    arrayList5 = new ArrayList(c8);
                }
            }
        }
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                AbstractC5214iw0.a((Notification.Builder) c1155Oo12.b, (String) it3.next());
            }
        }
        ArrayList arrayList7 = this.d;
        if (arrayList7.size() > 0) {
            if (this.s == null) {
                this.s = new Bundle();
            }
            Bundle bundle5 = this.s.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList7.size()) {
                String string = Integer.toString(i8);
                C2033Zv0 c2033Zv02 = (C2033Zv0) arrayList7.get(i8);
                Bundle bundle8 = new Bundle();
                if (c2033Zv02.b == null && (i = c2033Zv02.f) != 0) {
                    c2033Zv02.b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = c2033Zv02.b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i3);
                bundle8.putCharSequence("title", c2033Zv02.g);
                bundle8.putParcelable("actionIntent", c2033Zv02.h);
                Bundle bundle9 = c2033Zv02.a;
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean(str, c2033Zv02.d);
                bundle8.putBundle("extras", bundle10);
                MQ0[] mq0Arr2 = c2033Zv02.c;
                if (mq0Arr2 == null) {
                    c1155Oo1 = c1155Oo12;
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
                        C1155Oo1 c1155Oo13 = c1155Oo12;
                        bundle11.putString("resultKey", RNPushNotification.KEY_TEXT_REPLY);
                        bundle11.putCharSequence("label", mq0.a);
                        bundle11.putCharSequenceArray("choices", null);
                        bundle11.putBoolean("allowFreeFormInput", true);
                        bundle11.putBundle("extras", mq0.b);
                        HashSet hashSet = mq0.c;
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
                        c1155Oo12 = c1155Oo13;
                    }
                    c1155Oo1 = c1155Oo12;
                    arrayList3 = arrayList6;
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", c2033Zv02.e);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i8++;
                arrayList7 = arrayList2;
                str = str2;
                arrayList6 = arrayList3;
                c1155Oo12 = c1155Oo1;
                i3 = 0;
            }
            C1155Oo1 c1155Oo14 = c1155Oo12;
            arrayList = arrayList6;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.s == null) {
                this.s = new Bundle();
            }
            this.s.putBundle("android.car.EXTENSIONS", bundle5);
            c1155Oo12 = c1155Oo14;
            ((Bundle) c1155Oo12.d).putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            arrayList = arrayList6;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            ((Notification.Builder) c1155Oo12.b).setExtras(this.s);
            charSequence = null;
            AbstractC5596kw0.e((Notification.Builder) c1155Oo12.b, null);
        } else {
            charSequence = null;
        }
        if (i10 >= 26) {
            AbstractC5787lw0.b((Notification.Builder) c1155Oo12.b, 0);
            AbstractC5787lw0.e((Notification.Builder) c1155Oo12.b, charSequence);
            AbstractC5787lw0.f((Notification.Builder) c1155Oo12.b, this.w);
            AbstractC5787lw0.g((Notification.Builder) c1155Oo12.b, this.x);
            AbstractC5787lw0.d((Notification.Builder) c1155Oo12.b, 0);
            if (!TextUtils.isEmpty(this.v)) {
                ((Notification.Builder) c1155Oo12.b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            Iterator it5 = arrayList.iterator();
            if (it5.hasNext()) {
                throw AbstractC8235ym.d(it5);
            }
        }
        if (i10 >= 29) {
            AbstractC6169nw0.a((Notification.Builder) c1155Oo12.b, this.y);
            AbstractC6169nw0.b((Notification.Builder) c1155Oo12.b, null);
        }
        C3865fw0 c3865fw0 = (C3865fw0) c1155Oo12.c;
        AbstractC4056gw0 abstractC4056gw0 = c3865fw0.m;
        if (abstractC4056gw0 != null) {
            abstractC4056gw0.a(c1155Oo12);
        }
        int i11 = Build.VERSION.SDK_INT;
        Notification.Builder builder2 = (Notification.Builder) c1155Oo12.b;
        if (i11 < 26 && i11 < 24) {
            builder2.setExtras((Bundle) c1155Oo12.d);
            notificationBuild = builder2.build();
        } else {
            notificationBuild = builder2.build();
        }
        if (abstractC4056gw0 != null) {
            c3865fw0.m.getClass();
        }
        if (abstractC4056gw0 != null && (bundle = notificationBuild.extras) != null) {
            if (abstractC4056gw0.a) {
                bundle.putCharSequence("android.summaryText", (CharSequence) abstractC4056gw0.d);
            }
            CharSequence charSequence2 = (CharSequence) abstractC4056gw0.c;
            if (charSequence2 != null) {
                bundle.putCharSequence("android.title.big", charSequence2);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", abstractC4056gw0.d());
        }
        return notificationBuild;
    }

    public final void c() {
        this.r = "call";
    }

    public final void d(int i) {
        this.t = i;
    }

    public final void e(PendingIntent pendingIntent) {
        this.g = pendingIntent;
    }

    public final void f(int i) {
        Notification notification = this.z;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void g(int i, boolean z) {
        Notification notification = this.z;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void h(String str) {
        this.o = str;
    }

    public final void i(boolean z) {
        this.p = z;
    }

    public final void j(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void k(int i) {
        this.i = i;
    }

    public final void l(boolean z) {
        g(2, z);
    }

    public final void m(boolean z) {
        g(8, z);
    }

    public final void n(int i) {
        this.j = i;
    }

    public final void o(String str) {
        this.w = str;
    }

    public final void p(boolean z) {
        this.k = z;
    }

    public final void q(int i) {
        this.z.icon = i;
    }

    public final void r(Uri uri) {
        Notification notification = this.z;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = AbstractC3674ew0.a(AbstractC3674ew0.e(AbstractC3674ew0.c(AbstractC3674ew0.b(), 4), 5));
    }

    public final void s(AbstractC4056gw0 abstractC4056gw0) {
        if (this.m != abstractC4056gw0) {
            this.m = abstractC4056gw0;
            if (((C3865fw0) abstractC4056gw0.b) != this) {
                abstractC4056gw0.b = this;
                s(abstractC4056gw0);
            }
        }
    }

    public final void t(long[] jArr) {
        this.z.vibrate = jArr;
    }

    public final void u(int i) {
        this.u = i;
    }
}
