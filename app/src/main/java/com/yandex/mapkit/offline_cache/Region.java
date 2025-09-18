package com.yandex.mapkit.offline_cache;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class Region implements Serializable {
    private Point center;
    private String country;

    /* renamed from: id */
    private int f20721id;
    private String name;
    private Integer parentId;
    private long releaseTime;
    private LocalizedValue size;

    public Region(int i, String str, String str2, Point point, LocalizedValue localizedValue, long j, Integer num) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"country\" cannot be null");
        }
        if (point == null) {
            throw new IllegalArgumentException("Required field \"center\" cannot be null");
        }
        if (localizedValue == null) {
            throw new IllegalArgumentException("Required field \"size\" cannot be null");
        }
        this.f20721id = i;
        this.name = str;
        this.country = str2;
        this.center = point;
        this.size = localizedValue;
        this.releaseTime = j;
        this.parentId = num;
    }

    public Point getCenter() {
        return this.center;
    }

    public String getCountry() {
        return this.country;
    }

    public int getId() {
        return this.f20721id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public long getReleaseTime() {
        return this.releaseTime;
    }

    public LocalizedValue getSize() {
        return this.size;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f20721id = archive.add(this.f20721id);
        this.name = archive.add(this.name, false);
        this.country = archive.add(this.country, false);
        this.center = (Point) archive.add((Archive) this.center, false, (Class<Archive>) Point.class);
        this.size = (LocalizedValue) archive.add((Archive) this.size, false, (Class<Archive>) LocalizedValue.class);
        this.releaseTime = archive.add(this.releaseTime);
        this.parentId = archive.add(this.parentId, true);
    }

    public Region() {
    }
}
