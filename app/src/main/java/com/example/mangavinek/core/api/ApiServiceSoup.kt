package com.example.mangavinek.core.api

import org.jsoup.select.Elements

object ApiServiceSoup {
    fun getListHot(url: String): Elements {
        return JSoupService.getApiClient(url).select("td table.tborder")
    }

    fun getDetail(url: String): Elements {
        return JSoupService.getApiClient(url).select(".forums")
    }

    fun getDetailChapter(url: String): Elements {
        return JSoupService.getApiClient(url).select(".capa a")
    }
}