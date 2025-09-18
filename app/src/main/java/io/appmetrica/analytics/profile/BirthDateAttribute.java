package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.AbstractC4770R2;
import io.appmetrica.analytics.impl.C4509G4;
import io.appmetrica.analytics.impl.C4785Rh;
import io.appmetrica.analytics.impl.C4919X7;
import io.appmetrica.analytics.impl.C4943Y7;
import io.appmetrica.analytics.impl.C4957Yl;
import io.appmetrica.analytics.impl.C5004ak;
import io.appmetrica.analytics.impl.C5465t6;
import io.appmetrica.analytics.impl.C5629zk;
import io.appmetrica.analytics.impl.InterfaceC5007an;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public class BirthDateAttribute {

    /* renamed from: a */
    private final C5465t6 f33172a = new C5465t6("appmetrica_birth_date", new C4943Y7(), new C5629zk());

    /* renamed from: a */
    public final UserProfileUpdate m21297a(Calendar calendar, String str, AbstractC4770R2 abstractC4770R2) {
        return new UserProfileUpdate(new C4957Yl(this.f33172a.f32620c, new SimpleDateFormat(str).format(calendar.getTime()), new C4919X7(), new C4943Y7(), abstractC4770R2));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withAge(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return m21297a(gregorianCalendar, "yyyy", new C4509G4(this.f33172a.f32619b));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withAgeIfUndefined(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return m21297a(gregorianCalendar, "yyyy", new C5004ak(this.f33172a.f32619b));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withBirthDate(Calendar calendar) {
        return m21297a(calendar, "yyyy-MM-dd", new C4509G4(this.f33172a.f32619b));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withBirthDateIfUndefined(Calendar calendar) {
        return m21297a(calendar, "yyyy-MM-dd", new C5004ak(this.f33172a.f32619b));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValueReset() {
        return new UserProfileUpdate<>(new C4785Rh(0, this.f33172a.f32620c, new C4943Y7(), new C5629zk()));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withBirthDate(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return m21297a(gregorianCalendar, "yyyy", new C4509G4(this.f33172a.f32619b));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withBirthDateIfUndefined(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return m21297a(gregorianCalendar, "yyyy", new C5004ak(this.f33172a.f32619b));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withBirthDate(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return m21297a(gregorianCalendar, "yyyy-MM", new C4509G4(this.f33172a.f32619b));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withBirthDateIfUndefined(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return m21297a(gregorianCalendar, "yyyy-MM", new C5004ak(this.f33172a.f32619b));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withBirthDate(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return m21297a(gregorianCalendar, "yyyy-MM-dd", new C4509G4(this.f33172a.f32619b));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withBirthDateIfUndefined(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return m21297a(gregorianCalendar, "yyyy-MM-dd", new C5004ak(this.f33172a.f32619b));
    }
}
