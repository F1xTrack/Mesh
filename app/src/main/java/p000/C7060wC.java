package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: wC */
/* loaded from: classes.dex */
public final class C7060wC implements InterfaceC10231mA0 {

    /* renamed from: a */
    public static final Pattern f44705a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // p000.InterfaceC10231mA0
    /* renamed from: i */
    public final Object mo5748i(Uri uri, C1771bD c1771bD) throws IOException, NumberFormatException {
        String line = new BufferedReader(new InputStreamReader(c1771bD, AbstractC7227yr.f46511c)).readLine();
        try {
            Matcher matcher = f44705a.matcher(line);
            if (!matcher.matches()) {
                throw C10103lA0.m22367b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j2 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw C10103lA0.m22367b(null, e);
        }
    }
}
