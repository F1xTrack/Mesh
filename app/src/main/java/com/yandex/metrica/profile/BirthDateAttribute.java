package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p022ob.AbstractC3547qf;
import com.yandex.metrica.impl.p022ob.C2507Bf;
import com.yandex.metrica.impl.p022ob.C2532Cf;
import com.yandex.metrica.impl.p022ob.C2557Df;
import com.yandex.metrica.impl.p022ob.C2582Ef;
import com.yandex.metrica.impl.p022ob.C2690In;
import com.yandex.metrica.impl.p022ob.C3478no;
import com.yandex.metrica.impl.p022ob.C3599sf;
import com.yandex.metrica.impl.p022ob.C3677vf;
import com.yandex.metrica.impl.p022ob.InterfaceC2657Hf;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public class BirthDateAttribute {

    /* renamed from: a */
    public final C3677vf f25504a = new C3677vf("appmetrica_birth_date", new C3478no(), new C2557Df());

    /* renamed from: a */
    public final UserProfileUpdate m17377a(Calendar calendar, String str, AbstractC3547qf abstractC3547qf) {
        return new UserProfileUpdate(new C2582Ef(this.f25504a.m16975a(), new SimpleDateFormat(str).format(calendar.getTime()), new C2690In(), new C3478no(), abstractC3547qf));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withAge(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return m17377a(gregorianCalendar, "yyyy", new C3599sf(this.f25504a.m16977c()));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withAgeIfUndefined(int i) {
        int i2 = Calendar.getInstance(Locale.US).get(1) - i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i2);
        return m17377a(gregorianCalendar, "yyyy", new C2532Cf(this.f25504a.m16977c()));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withBirthDate(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return m17377a(gregorianCalendar, "yyyy", new C3599sf(this.f25504a.m16977c()));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withBirthDateIfUndefined(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return m17377a(gregorianCalendar, "yyyy", new C2532Cf(this.f25504a.m16977c()));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValueReset() {
        return new UserProfileUpdate<>(new C2507Bf(0, this.f25504a.m16975a(), new C3478no(), new C2557Df()));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withBirthDate(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return m17377a(gregorianCalendar, "yyyy-MM", new C3599sf(this.f25504a.m16977c()));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withBirthDateIfUndefined(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return m17377a(gregorianCalendar, "yyyy-MM", new C2532Cf(this.f25504a.m16977c()));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withBirthDate(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return m17377a(gregorianCalendar, "yyyy-MM-dd", new C3599sf(this.f25504a.m16977c()));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withBirthDateIfUndefined(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return m17377a(gregorianCalendar, "yyyy-MM-dd", new C2532Cf(this.f25504a.m16977c()));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withBirthDate(Calendar calendar) {
        return m17377a(calendar, "yyyy-MM-dd", new C3599sf(this.f25504a.m16977c()));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withBirthDateIfUndefined(Calendar calendar) {
        return m17377a(calendar, "yyyy-MM-dd", new C2532Cf(this.f25504a.m16977c()));
    }
}
