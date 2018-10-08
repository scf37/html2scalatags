html(cls := "html__responsive", 
  head(" ", 
    tag("title")(
      "Stack Overflow - Where Developers Learn, Share, & Build Careers"
    ), " ", 
    link(rel := "shortcut icon", href := "https://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico?v=4f32ecc8f43d"), " ", 
    link(rel := "apple-touch-icon image_src", href := "https://cdn.sstatic.net/Sites/stackoverflow/img/apple-touch-icon.png?v=c78bd457575a"), " ", 
    link(rel := "search", tpe := "application/opensearchdescription+xml", title := "Stack Overflow", href := "/opensearch.xml"), " ", 
    meta(name := "description", content := "Stack Overflow is the largest, most trusted online community for developers to learn, share​ ​their programming ​knowledge, and build their careers."), " ", 
    meta(name := "referrer", content := "origin"), " ", 
    meta(name := "viewport", content := "width=device-width, height=device-height, initial-scale=1.0, minimum-scale=1.0"), " ", 
    meta(attr("property") := "og:type", content := "website"), " ", 
    meta(attr("property") := "og:url", content := "https://stackoverflow.com/"), " ", 
    meta(attr("property") := "og:site_name", content := "Stack Overflow"), " ", 
    meta(attr("property") := "og:image", attr("itemprop") := "image primaryImageOfPage", content := "https://cdn.sstatic.net/Sites/stackoverflow/img/apple-touch-icon@2.png?v=73d79a89bded"), " ", 
    meta(name := "twitter:card", content := "summary"), " ", 
    meta(name := "twitter:domain", content := "stackoverflow.com"), " ", 
    meta(name := "twitter:title", attr("property") := "og:title", attr("itemprop") := "title name", content := "Stack Overflow - Where Developers Learn, Share, & Build Careers"), " ", 
    meta(name := "twitter:description", attr("property") := "og:description", attr("itemprop") := "description", content := "Stack Overflow | The World’s Largest Online Community for Developers"), " ", 
    script(src := "https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"), " ", 
    script(src := "https://cdn.sstatic.net/Js/stub.en.js?v=4fdd69bcd600"), " ", 
    link(rel := "stylesheet", tpe := "text/css", href := "https://cdn.sstatic.net/Shared/stacks.css?v=1e4e00d2a103"), " ", 
    link(rel := "stylesheet", tpe := "text/css", href := "https://cdn.sstatic.net/Sites/stackoverflow/primary-unified.css?v=d98ad55bb7fc"), " ", 
    link(rel := "alternate", tpe := "application/atom+xml", title := "Feed of recent questions", href := "/feeds"), " ", 
    script(
      raw(""" StackExchange.ready(function () {
            StackExchange.realtime.init('wss://qa.sockets.stackexchange.com');
            StackExchange.realtime.subscribeToReputationNotifications('1');
            StackExchange.realtime.subscribeToTopBarNotifications('1');
        }); """)
    ), " ", 
    script(
      raw(""" StackExchange.init({"locale":"en","serverTime":1538570736,"routeName":"Home/Index","stackAuthUrl":"https://stackauth.com","networkMetaHostname":"meta.stackexchange.com","site":{"name":"Stack Overflow","description":"Q&A for professional and enthusiast programmers","isNoticesTabEnabled":true,"enableNewTagCreationWarning":true,"insertSpaceAfterNameTabCompletion":false,"id":1,"childUrl":"https://meta.stackoverflow.com","enableSocialMediaInSharePopup":true,"protocol":"https"},"user":{"fkey":"fdad22724c911a3c3e4f2d81e970fd1e3b3e588d3743d6138d82b63a664967fb","tid":"ce11c398-6a5c-62bc-40da-776af5208d4a","rep":1389,"isRegistered":true,"userType":3,"userId":1445898,"accountId":1554291,"gravatar":""""), 
      raw("<div class=\\\"gravatar-wrapper-32\\\">"), 
      raw("""<img src=\\"https://www.gravatar.com/avatar/3f668122db3fbbe178051b918ca67de3?s=32&amp;d=identicon&amp;r=PG\\" alt=\\"\\" width=\\"32\\" height=\\"32\\">"""), 
      raw("""</div>","profileUrl":"https://stackoverflow.com/users/1445898/sergey-alaev","canSeeDeletedPosts":false},"realtime":{"newest":false,"active":false,"tagged":true,"staleDisconnectIntervalInHours":0,"workerIframeDomain":"https://cdn.sstatic.net"},"events":{"postType":{"question":1},"postEditionSection":{"title":1,"body":2,"tags":3}},"story":{"minCompleteBodyLength":75,"likedTagsMaxLength":300,"dislikedTagsMaxLength":300},"jobPreferences":{"maxNumDeveloperRoles":2,"maxNumIndustries":4},"svgIconPath":"https://cdn.sstatic.net/Img/svg-icons","svgIconHash":"0f0fc5e90a6d"}, {"site":{"allowImageUploads":true,"enableUserHovercards":true,"styleCode":true,"enableImgurHttps":true,"forceHttpsImages":true,"stacksValidation":true},"userMessaging":{"showNewFeatureNotice":true},"comments":{},"userProfile":{"openGraphAPIKey":"58740831ad23540e00c58987"},"tags":{},"accounts":{"currentPasswordRequiredForChangingStackIdPassword":true},"flags":{"allowRetractingFlags":true},"snippets":{"snippetsEnabled":true,"renderDomain":"stacksnippets.net"},"paths":{},"markdown":{"asteriskIntraWordEmphasis":true},"monitoring":{"clientTimingsAbsoluteTimeout":30000,"clientTimingsDebounceTimeout":1000},"mentions":{"maxNumUsersInDropdown":50},"slack":{"sidebarAdDismissCookie":"slack-sidebar-ad"}});
        StackExchange.using.setCacheBreakers({"js/prettify-full.en.js":"57d4cf5a1522","js/moderator.en.js":"c48addfbc3c8","js/full-anon.en.js":"f0a76174ffab","js/full.en.js":"ecf462a7f947","js/wmd.en.js":"6fb738ac6555","js/mobile.en.js":"4a1d56e42a88","js/help.en.js":"ea9b6d3ca995","js/tageditor.en.js":"8fc88803d94e","js/tageditornew.en.js":"e986e3658188","js/inline-tag-editing.en.js":"8e73ea969326","js/revisions.en.js":"be10a4167571","js/review.en.js":"aec17442ea99","js/tagsuggestions.en.js":"78eee7c19ab2","js/post-validation.en.js":"a9cc3be9b7da","js/explore-qlist.en.js":"13036a5f10ad","js/events.en.js":"90c83f6510ec","js/keyboard-shortcuts.en.js":"d069ae64dcff","js/external-editor.en.js":"53b91af35f73","js/adops.en.js":"22a9bd59b1e9","js/external-editor.en.js":"53b91af35f73","js/snippet-javascript.en.js":"ab76fd99422a","js/snippet-javascript-codemirror.en.js":"1afd891ff5fb"});
        StackExchange.using("gps", function() {
            StackExchange.gps.init(true);
        }); """)
    ), " ", 
    tag("noscript")(id := "noscript-css", 
      tag("style")(
        raw("body,.top-bar{margin-top:1.9em}")
      )
    ), " "
  ), 
  body(cls := "home-page unified-theme new-topbar", " ", 
    div(id := "notify-container"), " ", 
    div(id := "custom-header"), " ", 
    header(cls := "top-bar js-top-bar _fixed top-bar__network", " ", 
      div(cls := "-container", " ", 
        div(cls := "-main", " ", 
          a(href := "#", cls := "left-sidebar-toggle p0 ai-center jc-center js-left-sidebar-toggle", 
            span(cls := "ps-relative")
          ), " ", 
          a(href := "https://stackoverflow.com", cls := "-logo js-gps-track", data("gps-track") := "top_nav.click({is_current:true, location:1, destination:8})", " ", 
            span(cls := "-img _glyph", "Stack Overflow"), " "
          ), " "
        ), " ", 
        form(id := "search", action := "/search", method := "get", cls := "searchbar js-searchbar ", autocomplete := "off", role := "search", " ", 
          div(cls := "ps-relative", " ", 
            input(name := "q", tpe := "text", placeholder := "Search…", value := "", autocomplete := "off", maxlength := "240", cls := "f-input js-search-field "), " ", 
            button(tpe := "submit", aria.label := "Search...", cls := "s-btn s-btn__primary btn-topbar-primary js-search-submit", 
              tag("svg")(aria.hidden := "true", cls := "svg-icon mx0 iconSearch", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                tag("path")(attr("d") := "M12.86 11.32L18 16.5 16.5 18l-5.18-5.14v-.35a7 7 0 1 1 1.19-1.19h.35zM7 12A5 5 0 1 0 7 2a5 5 0 0 0 0 10z")
              )
            ), " "
          ), " "
        ), " ", 
        ol(cls := "-secondary js-secondary-topbar-links drop-icons-responsively", " ", 
          li(cls := "-item searchbar-trigger js-searchbar-trigger", 
            a(href := "#", cls := "-link", 
              tag("svg")(aria.hidden := "true", cls := "svg-icon iconSearch", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                tag("path")(attr("d") := "M12.86 11.32L18 16.5 16.5 18l-5.18-5.14v-.35a7 7 0 1 1 1.19-1.19h.35zM7 12A5 5 0 1 0 7 2a5 5 0 0 0 0 10z")
              )
            )
          ), " ", 
          li(cls := "-item", " ", 
            a(href := "/users/1445898/sergey-alaev", cls := "my-profile js-gps-track", data("gps-track") := "profile_summary.click()", " ", 
              div(cls := "gravatar-wrapper-24", title := "Sergey Alaev", 
                img(src := "https://www.gravatar.com/avatar/3f668122db3fbbe178051b918ca67de3?s=48&d=identicon&r=PG", alt := "", attr("width") := "24", attr("height") := "24", cls := "-avatar js-avatar-me")
              ), " ", 
              div(cls := "-rep js-header-rep", title := "your reputation: 1,389", "1,389"), " ", 
              div(cls := "-badges", " ", 
                span(title := "1 gold badge", 
                  span(cls := "badge1", raw("&#9679;")), 
                  span(cls := "badgecount", "1")
                ), 
                span(title := "12 silver badges", 
                  span(cls := "badge2", raw("&#9679;")), 
                  span(cls := "badgecount", "12")
                ), 
                span(title := "25 bronze badges", 
                  span(cls := "badge3", raw("&#9679;")), 
                  span(cls := "badgecount", "25")
                ), " "
              ), " "
            ), " "
          ), " ", 
          li(cls := "-item", " ", 
            a(href := "https://stackexchange.com/users/1554291?tab=inbox", cls := "-link js-inbox-button", title := "Recent inbox messages", " ", 
              tag("svg")(aria.hidden := "true", cls := "svg-icon iconInbox", attr("width") := "20", attr("height") := "18", attr("viewBox") := "0 0 20 18", 
                tag("path")(attr("d") := "M15.19 1H4.63c-.85 0-1.6.54-1.85 1.35L0 10.79V15c0 1.1.9 2 2 2h16a2 2 0 0 0 2-2v-4.21l-2.87-8.44A2 2 0 0 0 15.19 1zm-.28 10l-2 2h-6l-2-2H1.96L4.4 3.68A1 1 0 0 1 5.35 3h9.12a1 1 0 0 1 .95.68L17.86 11h-2.95z")
              ), " ", 
              span(cls := "indicator-badge js-unread-count _important", style := "display: none;"), " "
            ), " "
          ), " ", 
          li(cls := "-item", " ", 
            a(href := "https://stackexchange.com/users/1554291?tab=reputation", cls := "-link js-achievements-button", title := "Recent achievements: reputation, badges, and privileges earned", data("unread-class") := "_highlighted-positive", " ", 
              tag("svg")(aria.hidden := "true", cls := "svg-icon iconAchievements", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                tag("path")(attr("d") := "M15 2V1H3v1H0v4c0 1.6 1.4 3 3 3v1c.4 1.5 3 2.6 5 3v2H5s-1 1.5-1 2h10c0-.4-1-2-1-2h-3v-2c2-.4 4.6-1.5 5-3V9c1.6-.2 3-1.4 3-3V2h-3zM3 7c-.5 0-1-.5-1-1V4h1v3zm8.4 2.5L9 8 6.6 9.4l1-2.7L5 5h3l1-2.7L10 5h2.8l-2.3 1.8 1 2.7h-.1zM16 6c0 .5-.5 1-1 1V4h1v2z")
              ), " ", 
              span(cls := "indicator-badge js-unread-count _positive", style := "display: none;"), " "
            ), " "
          ), " ", 
          li(cls := "-item review-button-item", data("remove-order") := "2", " ", 
            a(href := "/review", cls := "-link js-gps-track js-review-button", title := "Review queues - help improve the site", data("gps-track") := "review_popup.click({ in_danger: false })", " ", 
              tag("svg")(aria.hidden := "true", cls := "svg-icon iconReviewQueue", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                tag("path")(attr("d") := "M16 7.5l-5 4.97-1.79-1.77a1 1 0 0 0-1.4 0l-2.1 2.1a1 1 0 0 0 0 1.4L8.5 17H2a2 2 0 0 1-2-2V3c0-1.1.9-2 2-2h12a2 2 0 0 1 2 2v4.5zM12 7H2v2h10V7zm2-4H2v2h12V3zM2 11v2h3v-2H2zm16-.5l-7 7-4-4L8.5 12l2.5 2.5L16.5 9l1.5 1.5z")
              ), " "
            ), " "
          ), " ", 
          li(cls := "-item help-button-item", data("remove-order") := "1", 
            a(href := "#", cls := "-link js-help-button", title := "Help Center and other resources", " ", 
              tag("svg")(aria.hidden := "true", cls := "svg-icon iconHelp", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                tag("path")(attr("d") := "M9 1a8 8 0 1 0 0 16A8 8 0 0 0 9 1zm.81 12.13c-.02.71-.55 1.15-1.24 1.13-.66-.02-1.17-.49-1.15-1.2.02-.72.56-1.18 1.22-1.16.7.03 1.2.51 1.17 1.23zM11.77 8a5.8 5.8 0 0 1-1.02.91l-.53.37c-.26.2-.42.43-.5.69a4 4 0 0 0-.09.75c0 .05-.03.16-.18.16H7.88c-.16 0-.18-.1-.18-.15.03-.66.12-1.21.4-1.66a5.29 5.29 0 0 1 1.43-1.22c.16-.12.28-.25.38-.39a1.34 1.34 0 0 0 .02-1.71c-.24-.31-.51-.46-1.03-.46-.51 0-.8.26-1.02.6-.21.33-.18.73-.18 1.1H5.75c0-1.38.35-2.25 1.1-2.76.52-.35 1.17-.5 1.93-.5 1 0 1.79.18 2.49.71.64.5.98 1.18.98 2.12 0 .57-.2 1.05-.48 1.44z")
              ), " "
            )
          ), " ", 
          li(cls := "-item", " ", 
            a(href := "https://stackexchange.com", cls := "-link js-site-switcher-button js-gps-track", data("gps-track") := "site_switcher.show", title := "A list of all 174 Stack Exchange sites", " ", 
              tag("svg")(aria.hidden := "true", cls := "svg-icon iconStackExchange", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                tag("path")(attr("d") := "M1 13c0 1.1.9 2 2 2h8v3l3-3h1a2 2 0 0 0 2-2v-2H1v2zM15 1H3a2 2 0 0 0-2 2v2h16V3a2 2 0 0 0-2-2zM1 6h16v4H1V6z")
              ), " "
            ), " "
          ), " ", 
          li(cls := "-dialog-container js-topbar-dialog-corral", " ", 
            div(cls := "topbar-dialog siteSwitcher-dialog dno", " ", 
              div(cls := "header", " ", 
                h3(
                  a(href := "https://stackoverflow.com", "current community"), " "
                ), " "
              ), " ", 
              div(cls := "modal-content current-site-container", " ", 
                ul(cls := "current-site", " ", 
                  li(cls := "grid", " ", 
                    div(cls := "fl1", " ", 
                      a(href := "https://stackoverflow.com", cls := "current-site-link site-link js-gps-track grid gs8 gsx", data("id") := "1", data("gps-track") := "site_switcher.click({ item_type:3 })", " ", 
                        div(cls := "favicon favicon-stackoverflow site-icon grid--cell", title := "Stack Overflow"), " ", 
                        span(cls := "grid--cell fl1", " Stack Overflow "), " "
                      ), " "
                    ), " ", 
                    div(cls := "related-links", " ", 
                      a(href := "https://stackoverflow.com/help", cls := "js-gps-track", data("gps-track") := "site_switcher.click({ item_type:14 })", "help"), " ", 
                      a(href := "https://chat.stackoverflow.com", cls := "js-gps-track", data("gps-track") := "site_switcher.click({ item_type:6 })", "chat"), " ", 
                      a(href := "https://stackoverflow.com/users/logout", cls := "js-gps-track", data("gps-track") := "site_switcher.click({ item_type:8 })", "log out"), " "
                    ), " "
                  ), " ", 
                  li(cls := "related-site grid", " ", 
                    div(cls := "L-shaped-icon-container", " ", 
                      span(cls := "L-shaped-icon"), " "
                    ), " ", 
                    a(href := "https://meta.stackoverflow.com", cls := "site-link js-gps-track grid gs8 gsx", data("id") := "552", data("gps-track") := "site.switch({ target_site:552, item_type:3 }),site_switcher.click({ item_type:4 })", " ", 
                      div(cls := "favicon favicon-stackoverflowmeta site-icon grid--cell", title := "Meta Stack Overflow"), " ", 
                      span(cls := "grid--cell fl1", 
                        " Meta Stack Overflow "
                      ), " "
                    ), " "
                  ), " "
                ), " "
              ), " ", 
              div(cls := "header", id := "your-communities-header", " ", 
                h3(" ", 
                  a(href := "https://stackexchange.com/users/1554291/?tab=accounts", "your communities"), " "
                ), " ", 
                a(href := "#", id := "edit-pinned-sites", "edit"), " ", 
                a(href := "#", id := "cancel-pinned-sites", style := "display: none;", "cancel"), " "
              ), " ", 
              div(cls := "modal-content", id := "your-communities-section", " ", 
                ul(cls := "my-sites", " ", 
                  li(" ", 
                    a(href := "https://stackoverflow.com", cls := "site-link js-gps-track grid gs8 gsx", data("id") := "1", data("gps-track") := "site.switch({ target_site:1, item_type:3 }),site_switcher.click({ item_type:1 })", " ", 
                      div(cls := "favicon favicon-stackoverflow site-icon grid--cell", title := "Stack Overflow"), " ", 
                      span(cls := "grid--cell fl1", " Stack Overflow "), " ", 
                      span(cls := "rep-score grid--cell", "1,389"), " "
                    ), " "
                  ), " ", 
                  li(" ", 
                    a(href := "https://serverfault.com", cls := "site-link js-gps-track grid gs8 gsx", data("id") := "2", data("gps-track") := "site.switch({ target_site:2, item_type:3 }),site_switcher.click({ item_type:1 })", " ", 
                      div(cls := "favicon favicon-serverfault site-icon grid--cell", title := "Server Fault"), " ", 
                      span(cls := "grid--cell fl1", " Server Fault "), " ", 
                      span(cls := "rep-score grid--cell", "178"), " "
                    ), " "
                  ), " ", 
                  li(" ", 
                    a(href := "https://softwareengineering.stackexchange.com", cls := "site-link js-gps-track grid gs8 gsx", data("id") := "131", data("gps-track") := "site.switch({ target_site:131, item_type:3 }),site_switcher.click({ item_type:1 })", " ", 
                      div(cls := "favicon favicon-softwareengineering site-icon grid--cell", title := "Software Engineering"), " ", 
                      span(cls := "grid--cell fl1", 
                        " Software Engineering "
                      ), " ", 
                      span(cls := "rep-score grid--cell", "166"), " "
                    ), " "
                  ), " ", 
                  li(" ", 
                    a(href := "https://crypto.stackexchange.com", cls := "site-link js-gps-track grid gs8 gsx", data("id") := "281", data("gps-track") := "site.switch({ target_site:281, item_type:3 }),site_switcher.click({ item_type:1 })", " ", 
                      div(cls := "favicon favicon-crypto site-icon grid--cell", title := "Cryptography"), " ", 
                      span(cls := "grid--cell fl1", " Cryptography "), " ", 
                      span(cls := "rep-score grid--cell", "124"), " "
                    ), " "
                  ), " ", 
                  li(" ", 
                    a(href := "https://dba.stackexchange.com", cls := "site-link js-gps-track grid gs8 gsx", data("id") := "182", data("gps-track") := "site.switch({ target_site:182, item_type:3 }),site_switcher.click({ item_type:1 })", " ", 
                      div(cls := "favicon favicon-dba site-icon grid--cell", title := "Database Administrators"), " ", 
                      span(cls := "grid--cell fl1", 
                        " Database Administrators "
                      ), " ", 
                      span(cls := "rep-score grid--cell", "111"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "pinned-site-editor-container", style := "display: none;", " ", 
                  input(id := "js-site-search-txt", tpe := "text", cls := "site-filter-input", value := "", placeholder := "Add a Stack Exchange community"), 
                  input(tpe := "hidden", name := "fkey", value := "fdad22724c911a3c3e4f2d81e970fd1e3b3e588d3743d6138d82b63a664967fb", " "), " ", 
                  input(tpe := "submit", id := "pin-site-btn", value := "Add", disabled), " ", 
                  ul(cls := "js-found-sites found-sites"), " ", 
                  ul(cls := "pinned-site-list sortable", data("custom-list") := "False", " "), " ", 
                  input(tpe := "submit", value := "Save", id := "save-pinned-sites-btn", disabled), " ", 
                  a(href := "#", id := "reset-pinned-sites", 
                    "reset to default list"
                  ), " "
                ), " "
              ), " ", 
              div(cls := "header", " ", 
                h3(
                  a(href := "https://stackexchange.com/sites", 
                    "more stack exchange communities"
                  ), " "
                ), " ", 
                a(href := "https://stackoverflow.blog", cls := "fr", "company blog"), " "
              ), " ", 
              div(cls := "modal-content", " ", 
                div(cls := "child-content"), " "
              ), " "
            ), " ", 
            div(cls := "topbar-dialog help-dialog js-help-dialog dno", " ", 
              div(cls := "modal-content", " ", 
                ul(" ", 
                  li(" ", 
                    a(href := "/tour", cls := "js-gps-track", data("gps-track") := "help_popup.click({ item_type:1 })", " Tour ", 
                      span(cls := "item-summary", 
                        " Start here for a quick overview of the site "
                      ), " "
                    ), " "
                  ), " ", 
                  li(" ", 
                    a(href := "/help", cls := "js-gps-track", data("gps-track") := "help_popup.click({ item_type:4 })", " Help Center ", 
                      span(cls := "item-summary", 
                        " Detailed answers to any questions you might have "
                      ), " "
                    ), " "
                  ), " ", 
                  li(" ", 
                    a(href := "https://meta.stackoverflow.com", cls := "js-gps-track", data("gps-track") := "help_popup.click({ item_type:2 })", " Meta ", 
                      span(cls := "item-summary", 
                        " Discuss the workings and policies of this site "
                      ), " "
                    ), " "
                  ), " ", 
                  li(" ", 
                    a(href := "https://stackoverflow.com/company/about", cls := "js-gps-track", data("gps-track") := "help_popup.click({ item_type:6 })", " About Us ", 
                      span(cls := "item-summary", 
                        " Learn more about Stack Overflow the company "
                      ), " "
                    ), " "
                  ), " ", 
                  li(" ", 
                    a(href := "https://www.stackoverflowbusiness.com/?ref=topbar_help", cls := "js-gps-track", data("gps-track") := "help_popup.click({ item_type:7 })", " Business ", 
                      span(cls := "item-summary", 
                        " Learn more about hiring developers or posting ads with us "
                      ), " "
                    ), " "
                  ), " "
                ), " "
              ), " "
            ), " ", 
            div(cls := "topbar-dialog leftnav-dialog js-leftnav-dialog dno", " ", 
              div(cls := "left-sidebar js-unpinned-left-sidebar", data("can-be") := "left-sidebar", data("is-here-when") := "sm"), " "
            ), " "
          ), " "
        ), " "
      ), " "
    ), " ", 
    div(id := "js-gdpr-consent-banner", cls := "p16 bg-black-700 ff-sans fc-white ps-fixed b0 l0 r0 z-banner", role := "banner", aria.hidden := "false", " ", 
      div(cls := "wmx8 mx-auto grid jc-center", role := "alertdialog", aria.describedby := "notice-message", " ", 
        div(cls := "grid--cell mr12", aria.label := "notice-message", " ", 
          p(cls := "mb0 lh-lg", 
            " By using our site, you acknowledge that you have read and understand our ", 
            a(cls := "s-link s-link__inherit td-underline fc-white", target := "_blank", href := "https://stackoverflow.com/legal/cookie-policy", "Cookie Policy"), ", ", 
            a(cls := "s-link s-link__inherit td-underline fc-white", target := "_blank", href := "https://stackoverflow.com/legal/privacy-policy", "Privacy Policy"), ", and our ", 
            a(cls := "s-link s-link__inherit td-underline fc-white", target := "_blank", href := "https://stackoverflow.com/legal/terms-of-service/public", "Terms of Service"), ". "
          ), " "
        ), " ", 
        a(cls := "grid--cell fc-white js-notice-close", aria.label := "notice-dismiss", " ", 
          tag("svg")(aria.hidden := "true", cls := "svg-icon m0 iconClear", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
            tag("path")(attr("d") := "M15 4.41L13.59 3 9 7.59 4.41 3 3 4.41 7.59 9 3 13.59 4.41 15 9 10.41 13.59 15 15 13.59 10.41 9z")
          ), " "
        ), " "
      ), " "
    ), " ", 
    script(
      raw(""" StackExchange.ready(function () { StackExchange.topbar.init({ observeSize: true }); });
    StackExchange.scrollPadding.setPaddingTop(50, 10); """)
    ), " ", 
    div(cls := "container", " ", 
      div(id := "left-sidebar", data("is-here-when") := "md lg", cls := "left-sidebar js-pinned-left-sidebar", " ", 
        div(cls := "left-sidebar--sticky-container js-sticky-leftnav", " ", 
          tag("nav")(role := "navigation", " ", 
            ol(cls := "nav-links", " ", 
              li(" ", 
                li(cls := " youarehere", " ", 
                  a(href := "/", cls := "pl8 js-gps-track nav-links--link", data("gps-track") := "top_nav.click({is_current:true, location:1, destination:8})", " Home "), " "
                ), " "
              ), " ", 
              li(" ", 
                ol(cls := "nav-links", " ", 
                  li(cls := "fs-fine tt-uppercase ml8 mt16 mb4 fc-light", "Public"), " ", 
                  li(" ", 
                    a(id := "nav-questions", href := "/questions", cls := "pl8 js-gps-track nav-links--link -link__with-icon", data("gps-track") := "top_nav.click({is_current:false, location:1, destination:1})", " ", 
                      tag("svg")(aria.hidden := "true", cls := "svg-icon iconGlobe", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                        tag("path")(attr("d") := "M9 1a8 8 0 1 0 0 16A8 8 0 0 0 9 1zM8 15.32a6.4 6.4 0 0 1-5.23-7.75L7 11.68v.8c0 .88.12 1.32 1 1.32v1.52zm5.72-2c-.2-.66-1-1.32-1.72-1.32h-1v-2c0-.44-.56-1-1-1H6V7h1c.44 0 1-.56 1-1V5h2c.88 0 1.4-.72 1.4-1.6v-.33a6.4 6.4 0 0 1 2.32 10.24z")
                      ), " ", 
                      span(cls := "-link--channel-name", "Stack Overflow"), " "
                    ), " "
                  ), " ", 
                  li(" ", 
                    a(id := "nav-tags", href := "/tags", cls := " js-gps-track nav-links--link", data("gps-track") := "top_nav.click({is_current:false, location:1, destination:2})", " Tags "), " "
                  ), " ", 
                  li(" ", 
                    a(id := "nav-users", href := "/users", cls := " js-gps-track nav-links--link", data("gps-track") := "top_nav.click({is_current:false, location:1, destination:3})", " Users "), " "
                  ), " ", 
                  li(" ", 
                    a(id := "nav-jobs", href := "/jobs?med=site-ui&ref=jobs-tab", cls := " js-gps-track nav-links--link", data("gps-track") := "top_nav.click({is_current:false, location:1, destination:6})", " Jobs "), " "
                  ), " "
                ), " "
              ), " ", 
              li(" ", 
                ol(cls := "nav-links", " ", 
                  li(cls := "p6", " ", 
                    div(cls := "ba bc-black-2 bar-sm p16 grid fd-column ps-relative overflow-hidden", " ", 
                      strong(cls := "grid--cell", "Teams"), " ", 
                      span(cls := "grid--cell mt2 fs-caption fc-medium", "Q&A for work "), " ", 
                      a(href := "https://stackoverflow.com/teams", cls := "js-gps-track s-btn s-btn__outlined ta-center grid--cell mt12", data("gps-track") := "teams.create.left-sidenav.click", data("ga") := """["teams traffic","left nav cta","stackoverflow.com/teams",null,{"dimension4":"teams"}]""", " Learn More "), " ", 
                      div(cls := "ps-absolute t4 rn6", " ", 
                        tag("svg")(attr("width") := "53", attr("height") := "49", attr("fill") := "none", xmlns := "http://www.w3.org/2000/svg", 
                          tag("path")(attr("d") := "M49 11l.2 31H18.9L9 49v-7H4V8h31", attr("fill") := "#CCEAFF"), 
                          tag("path")(attr("d") := "M44.5 19v-.3l-.2-.1-18-13-.1-.1H.5v33h4V46l.8-.6 9.9-6.9h29.3V19z", attr("stroke") := "#1060E1", attr("stroke-miterlimit") := "10"), 
                          tag("path")(attr("d") := "M31 2l6-1.5 7 2V38H14.9L5 45v-7H1V6h25l5-4z", attr("fill") := "#fff"), 
                          tag("path")(attr("d") := "M7 16.5h13m-13 6h14m-14 6h18", attr("stroke") := "#1060E1", attr("stroke-miterlimit") := "10"), 
                          tag("path")(attr("d") := "M39 30a14 14 0 1 0 0-28 14 14 0 0 0 0 28z", attr("fill") := "#FFB935"), 
                          tag("path")(attr("d") := "M50.5 14a13.5 13.5 0 1 1-27 0 13.5 13.5 0 0 1 27 0z", attr("stroke") := "#F48024", attr("stroke-miterlimit") := "10"), 
                          tag("path")(attr("d") := "M32.5 21.5v-8h9v8h-9zm2-9.5V9.3A2.5 2.5 0 0 1 37 6.8a2.5 2.5 0 0 1 2.5 2.5V12h-5zm2 3v2m1-2v2", attr("stroke") := "#fff", attr("stroke-miterlimit") := "10")
                        ), " "
                      ), " "
                    ), " "
                  ), " "
                ), " "
              ), " "
            ), " "
          ), " "
        ), " "
      ), " ", 
      div(id := "content", cls := "snippet-hidden", " ", 
        div(id := "mainbar", " ", 
          div(cls := "grid", " ", 
            h1(cls := "grid--cell fl1 fs-headline1", " Top Questions "), " ", 
            div(cls := "pl8 aside-cta grid--cell", role := "navigation", aria.label := "ask new question", " ", 
              a(href := "/questions/ask", cls := "d-inline-flex ai-center ws-nowrap s-btn s-btn__primary", "Ask Question"), " "
            ), " "
          ), " ", 
          div(cls := "grid ai-center mb16", " ", 
            div(cls := "grid--cell fl1 fs-body3"), " ", 
            div(cls := "grid--cell", " ", 
              div(cls := "grid tabs-filter s-btn-group tt-capitalize", " ", 
                a(cls := "youarehere is-selected grid--cell s-btn s-btn__muted s-btn__outlined py8 ws-nowrap", href := "?tab=interesting", data("nav-xhref") := "", title := "Questions that may be of interest to you based on your history and tag preference", data("value") := "interesting", data("shortcut") := "", " interesting"), " ", 
                a(cls := "grid--cell s-btn s-btn__muted s-btn__outlined py8 ws-nowrap", href := "?tab=featured", data("nav-xhref") := "", title := "Questions with an active bounty", data("value") := "featured", data("shortcut") := "B", " ", 
                  span(cls := "bounty-indicator-tab", "327"), " featured"
                ), " ", 
                a(cls := "grid--cell s-btn s-btn__muted s-btn__outlined py8 ws-nowrap", href := "?tab=hot", data("nav-xhref") := "", title := "Questions with the most views, answers, and votes over the last few days", data("value") := "hot", data("shortcut") := "H", " hot"), " ", 
                a(cls := "grid--cell s-btn s-btn__muted s-btn__outlined py8 ws-nowrap", href := "?tab=week", data("nav-xhref") := "", title := "Questions with the most views, answers, and votes this week", data("value") := "week", data("shortcut") := "W", " week"), " ", 
                a(cls := "grid--cell s-btn s-btn__muted s-btn__outlined py8 ws-nowrap", href := "?tab=month", data("nav-xhref") := "", title := "Questions with the most views, answers, and votes this month", data("value") := "month", data("shortcut") := "M", " month"), " "
              ), " "
            ), " "
          ), " ", 
          div(id := "qlist-wrapper", cls := "flush-left", " ", 
            div(id := "question-mini-list", " ", 
              div(" ", 
                div(cls := "question-summary narrow", id := "question-summary-52501462", " ", 
                  div(onclick := "window.location.href='/questions/52501462/firebase-dynamiclinks-failed-on-version-16-1-1'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered-accepted", title := "one of the answers was accepted as the correct answer", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "29 views", "29")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52501462/firebase-dynamiclinks-failed-on-version-16-1-1", cls := "question-hyperlink", 
                        "Firebase DynamicLinks failed on version 16.1.1"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-firebase t-firebase-dynamic-links", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/firebase", cls := "post-tag", title := "show questions tagged 'firebase'", rel := "tag", "firebase", 
                        img(src := "//i.stack.imgur.com/5d55j.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/firebase-dynamic-links", cls := "post-tag", title := "show questions tagged 'firebase-dynamic-links'", rel := "tag", 
                        "firebase-dynamic-links"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52501462/firebase-dynamiclinks-failed-on-version-16-1-1/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:43:53Z", cls := "relativetime", "1 min ago")
                      ), " ", 
                      a(href := "/users/8244025/dev-for-fun", "dev.for.fun"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "118"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626953", " ", 
                  div(onclick := "window.location.href='/questions/52626953/how-to-achieve-multi-processing-in-consuming-kafka-messages-without-partitionin'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 votes", "2")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "3 views", "3")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626953/how-to-achieve-multi-processing-in-consuming-kafka-messages-without-partitionin", cls := "question-hyperlink", 
                        "How to achieve multi-processing in, consuming kafka messages without partitioning the topic?"
                      )
                    ), " ", 
                    div(cls := "tags t-apache-kafka t-kafka-consumer-api", " ", 
                      a(href := "/questions/tagged/apache-kafka", cls := "post-tag", title := "show questions tagged 'apache-kafka'", rel := "tag", "apache-kafka"), " ", 
                      a(href := "/questions/tagged/kafka-consumer-api", cls := "post-tag", title := "show questions tagged 'kafka-consumer-api'", rel := "tag", "kafka-consumer-api"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626953/how-to-achieve-multi-processing-in-consuming-kafka-messages-without-partitionin", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:43:40Z", cls := "relativetime", "1 min ago")
                      ), " ", 
                      a(href := "/users/3305994/kkk", "kkk"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "11"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627124", " ", 
                  div(onclick := "window.location.href='/questions/52627124/i-am-trying-to-use-the-google-analytics-add-on-for-google-sheets-but-multiple-fi'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "5 views", "5")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627124/i-am-trying-to-use-the-google-analytics-add-on-for-google-sheets-but-multiple-fi", cls := "question-hyperlink", 
                        "I am trying to use the Google Analytics Add-on for Google Sheets but multiple filters are not working as expected"
                      )
                    ), " ", 
                    div(cls := "tags t-google-analytics t-google-sheets t-google-analytics-api", " ", 
                      a(href := "/questions/tagged/google-analytics", cls := "post-tag", title := "show questions tagged 'google-analytics'", rel := "tag", "google-analytics", 
                        img(src := "//i.stack.imgur.com/6HFc3.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/google-sheets", cls := "post-tag", title := "show questions tagged 'google-sheets'", rel := "tag", "google-sheets"), " ", 
                      a(href := "/questions/tagged/google-analytics-api", cls := "post-tag", title := "show questions tagged 'google-analytics-api'", rel := "tag", 
                        "google-analytics-api", 
                        img(src := "//i.stack.imgur.com/6HFc3.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627124/i-am-trying-to-use-the-google-analytics-add-on-for-google-sheets-but-multiple-fi", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:43:29Z", cls := "relativetime", "2 mins ago")
                      ), " ", 
                      a(href := "/users/1841839/daimto", "DaImTo"), " ", 
                      span(cls := "reputation-score", title := "reputation score 40,153", dir := "ltr", "40.2k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627317", " ", 
                  div(onclick := "window.location.href='/questions/52627317/web2py-zappa-awslamda'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "3 views", "3")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627317/web2py-zappa-awslamda", cls := "question-hyperlink", 
                        "Web2py Zappa AWSLamda"
                      )
                    ), " ", 
                    div(cls := "tags t-aws-lambda t-web2py t-python-zappa", " ", 
                      a(href := "/questions/tagged/aws-lambda", cls := "post-tag", title := "show questions tagged 'aws-lambda'", rel := "tag", "aws-lambda"), " ", 
                      a(href := "/questions/tagged/web2py", cls := "post-tag", title := "show questions tagged 'web2py'", rel := "tag", "web2py"), " ", 
                      a(href := "/questions/tagged/python-zappa", cls := "post-tag", title := "show questions tagged 'python-zappa'", rel := "tag", "python-zappa"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627317/web2py-zappa-awslamda", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:43:16Z", cls := "relativetime", "2 mins ago")
                      ), " ", 
                      a(href := "/users/7486447/arkhan", "ARKhan"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "91"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627312", " ", 
                  div(onclick := "window.location.href='/questions/52627312/running-multiple-backend-services-using-ihostedservice'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "3 views", "3")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627312/running-multiple-backend-services-using-ihostedservice", cls := "question-hyperlink", 
                        "Running multiple backend services using iHostedService"
                      )
                    ), " ", 
                    div(cls := "tags t-aspûnet-core t-aspûnet-core-2û0 t-aspûnet-core-webapi", " ", 
                      a(href := "/questions/tagged/asp.net-core", cls := "post-tag", title := "show questions tagged 'asp.net-core'", rel := "tag", "asp.net-core"), " ", 
                      a(href := "/questions/tagged/asp.net-core-2.0", cls := "post-tag", title := "show questions tagged 'asp.net-core-2.0'", rel := "tag", "asp.net-core-2.0"), " ", 
                      a(href := "/questions/tagged/asp.net-core-webapi", cls := "post-tag", title := "show questions tagged 'asp.net-core-webapi'", rel := "tag", "asp.net-core-webapi"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627312/running-multiple-backend-services-using-ihostedservice", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:43:05Z", cls := "relativetime", "2 mins ago")
                      ), " ", 
                      a(href := "/users/5164470/rasula-caldera", "Rasula Caldera"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "136"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52610081", " ", 
                  div(onclick := "window.location.href='/questions/52610081/how-to-create-an-invitation-system-using-firestore-on-android'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "14 views", "14")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52610081/how-to-create-an-invitation-system-using-firestore-on-android", cls := "question-hyperlink", 
                        "How to create an invitation system using Firestore on Android"
                      )
                    ), " ", 
                    div(cls := "tags t-android t-firebase t-google-cloud-firestore", " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/firebase", cls := "post-tag", title := "show questions tagged 'firebase'", rel := "tag", "firebase", 
                        img(src := "//i.stack.imgur.com/5d55j.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/google-cloud-firestore", cls := "post-tag", title := "show questions tagged 'google-cloud-firestore'", rel := "tag", 
                        "google-cloud-firestore"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52610081/how-to-create-an-invitation-system-using-firestore-on-android/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 12:42:20Z", cls := "relativetime", "3 mins ago")
                      ), " ", 
                      a(href := "/users/5246885/alex-mamo", "Alex Mamo"), " ", 
                      span(cls := "reputation-score", title := "reputation score 31,495", dir := "ltr", "31.5k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627277", " ", 
                  div(onclick := "window.location.href='/questions/52627277/how-to-handle-huge-efcore-migrations-designer-files-that-is-slowing-down-build-a'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 views", "2")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627277/how-to-handle-huge-efcore-migrations-designer-files-that-is-slowing-down-build-a", cls := "question-hyperlink", 
                        "How to handle huge efcore migrations designer files that is slowing down build and IDE"
                      )
                    ), " ", 
                    div(cls := "tags t-ef-core-2û1", " ", 
                      a(href := "/questions/tagged/ef-core-2.1", cls := "post-tag", title := "show questions tagged 'ef-core-2.1'", rel := "tag", "ef-core-2.1"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627277/how-to-handle-huge-efcore-migrations-designer-files-that-is-slowing-down-build-a", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:41:10Z", cls := "relativetime", "4 mins ago")
                      ), " ", 
                      a(href := "/users/8660149/kim-hansen", "Kim Hansen"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "26"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52623066", " ", 
                  div(onclick := "window.location.href='/questions/52623066/use-spring-transactional-in-a-prototype-bean'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "14 views", "14")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52623066/use-spring-transactional-in-a-prototype-bean", cls := "question-hyperlink", 
                        "Use spring Transactional in a Prototype bean"
                      )
                    ), " ", 
                    div(cls := "tags t-spring t-transactional", " ", 
                      a(href := "/questions/tagged/spring", cls := "post-tag", title := "show questions tagged 'spring'", rel := "tag", "spring"), " ", 
                      a(href := "/questions/tagged/transactional", cls := "post-tag", title := "show questions tagged 'transactional'", rel := "tag", "transactional"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52623066/use-spring-transactional-in-a-prototype-bean", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:40:26Z", cls := "relativetime", "5 mins ago")
                      ), " ", 
                      a(href := "/users/887343/forhas", "forhas"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "4,843"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626749", " ", 
                  div(onclick := "window.location.href='/questions/52626749/how-can-i-arrange-an-array-from-500-down-to-1-in-an-array-java'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "3 votes", "3")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered-accepted", title := "one of the answers was accepted as the correct answer", " ", 
                      div(cls := "mini-counts", 
                        span(title := "5 answers", "5")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "46 views", "46")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626749/how-can-i-arrange-an-array-from-500-down-to-1-in-an-array-java", cls := "question-hyperlink", 
                        "How can I arrange an array from 500 down to 1 in an array? (Java)"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-arrays t-sorting", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/arrays", cls := "post-tag", title := "show questions tagged 'arrays'", rel := "tag", "arrays"), " ", 
                      a(href := "/questions/tagged/sorting", cls := "post-tag", title := "show questions tagged 'sorting'", rel := "tag", "sorting"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626749/how-can-i-arrange-an-array-from-500-down-to-1-in-an-array-java/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 12:40:21Z", cls := "relativetime", "5 mins ago")
                      ), " ", 
                      a(href := "/users/7398298/arjunan", "arjunan"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "124"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627256", " ", 
                  div(onclick := "window.location.href='/questions/52627256/how-to-change-project-title-in-intellij-idea'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 views", "2")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627256/how-to-change-project-title-in-intellij-idea", cls := "question-hyperlink", 
                        "How to change project title in intelliJ Idea?"
                      )
                    ), " ", 
                    div(cls := "tags t-intellij-idea", " ", 
                      a(href := "/questions/tagged/intellij-idea", cls := "post-tag", title := "show questions tagged 'intellij-idea'", rel := "tag", "intellij-idea"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627256/how-to-change-project-title-in-intellij-idea", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:40:13Z", cls := "relativetime", "5 mins ago")
                      ), " ", 
                      a(href := "/users/5184681/mostafamashayekhi", "MostafaMashayekhi"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "4,301"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627253", " ", 
                  div(onclick := "window.location.href='/questions/52627253/voltdb-community-edition-for-commercial'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "4 views", "4")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627253/voltdb-community-edition-for-commercial", cls := "question-hyperlink", 
                        "voltdb community edition for commercial"
                      )
                    ), " ", 
                    div(cls := "tags t-voltdb", " ", 
                      a(href := "/questions/tagged/voltdb", cls := "post-tag", title := "show questions tagged 'voltdb'", rel := "tag", "voltdb"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627253/voltdb-community-edition-for-commercial", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:40:07Z", cls := "relativetime", "5 mins ago")
                      ), " ", 
                      a(href := "/users/9565219/philip-yoon", "Philip Yoon"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "5"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627248", " ", 
                  div(onclick := "window.location.href='/questions/52627248/keep-serversocket-alive-in-javafx-application'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "7 views", "7")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627248/keep-serversocket-alive-in-javafx-application", cls := "question-hyperlink", 
                        "Keep ServerSocket alive in JavaFX application"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-javafx t-java-8 t-javafx-8", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/javafx", cls := "post-tag", title := "show questions tagged 'javafx'", rel := "tag", "javafx"), " ", 
                      a(href := "/questions/tagged/java-8", cls := "post-tag", title := "show questions tagged 'java-8'", rel := "tag", "java-8"), " ", 
                      a(href := "/questions/tagged/javafx-8", cls := "post-tag", title := "show questions tagged 'javafx-8'", rel := "tag", "javafx-8"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627248/keep-serversocket-alive-in-javafx-application", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:39:52Z", cls := "relativetime", "5 mins ago")
                      ), " ", 
                      a(href := "/users/8172857/boussadjra-brahim", "boussadjra brahim"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1,174"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627241", " ", 
                  div(onclick := "window.location.href='/questions/52627241/cartpole-howo-to-use-optimizer-loss-plus-categorical-vs-bernoulli'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "6 views", "6")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627241/cartpole-howo-to-use-optimizer-loss-plus-categorical-vs-bernoulli", cls := "question-hyperlink", 
                        "CartPole - Howo to use optimizer & loss, plus Categorical vs Bernoulli,"
                      )
                    ), " ", 
                    div(cls := "tags t-pytorch", " ", 
                      a(href := "/questions/tagged/pytorch", cls := "post-tag", title := "show questions tagged 'pytorch'", rel := "tag", "pytorch"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627241/cartpole-howo-to-use-optimizer-loss-plus-categorical-vs-bernoulli", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:39:33Z", cls := "relativetime", "6 mins ago")
                      ), " ", 
                      a(href := "/users/10333852/solst", "solst"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "7"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52476055", " ", 
                  div(onclick := "window.location.href='/questions/52476055/how-to-modify-an-object-value-in-arraylist-that-has-value-similar-to-the-other-o'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "-1 votes", "-1")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered-accepted", title := "one of the answers was accepted as the correct answer", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "49 views", "49")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52476055/how-to-modify-an-object-value-in-arraylist-that-has-value-similar-to-the-other-o", cls := "question-hyperlink", 
                        "How to modify an object value in ArrayList that has value similar to the other objects"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-arraylist t-genetic", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/arraylist", cls := "post-tag", title := "show questions tagged 'arraylist'", rel := "tag", "arraylist"), " ", 
                      a(href := "/questions/tagged/genetic", cls := "post-tag", title := "show questions tagged 'genetic'", rel := "tag", "genetic"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52476055/how-to-modify-an-object-value-in-arraylist-that-has-value-similar-to-the-other-o/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:38:02Z", cls := "relativetime", "7 mins ago")
                      ), " ", 
                      a(href := "/users/5577814/evan-snapp", "Evan Snapp"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "106"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52450025", " ", 
                  div(onclick := "window.location.href='/questions/52450025/how-to-modify-sql-statements-before-they-get-executed-in-jdbi-3-sql-objects'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 votes", "2")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "37 views", "37")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52450025/how-to-modify-sql-statements-before-they-get-executed-in-jdbi-3-sql-objects", cls := "question-hyperlink", 
                        "How to modify SQL statements before they get executed in JDBI 3 (SQL Objects)"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-dropwizard t-jdbi", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/dropwizard", cls := "post-tag", title := "show questions tagged 'dropwizard'", rel := "tag", "dropwizard"), " ", 
                      a(href := "/questions/tagged/jdbi", cls := "post-tag", title := "show questions tagged 'jdbi'", rel := "tag", "jdbi"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52450025/how-to-modify-sql-statements-before-they-get-executed-in-jdbi-3-sql-objects/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 12:37:46Z", cls := "relativetime", "7 mins ago")
                      ), " ", 
                      a(href := "/users/10215232/spasa-mihajlovic", "Spasa Mihajlovic"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "71"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627023", " ", 
                  div(onclick := "window.location.href='/questions/52627023/how-can-i-create-profiles-with-spring-boot-yaml'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "26 views", "26")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627023/how-can-i-create-profiles-with-spring-boot-yaml", cls := "question-hyperlink", 
                        "How can I create profiles with spring boot + .yaml?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-spring-boot t-yaml", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/spring-boot", cls := "post-tag", title := "show questions tagged 'spring-boot'", rel := "tag", "spring-boot"), " ", 
                      a(href := "/questions/tagged/yaml", cls := "post-tag", title := "show questions tagged 'yaml'", rel := "tag", "yaml"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627023/how-can-i-create-profiles-with-spring-boot-yaml/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:37:43Z", cls := "relativetime", "7 mins ago")
                      ), " ", 
                      a(href := "/users/1898563/michael", "Michael"), " ", 
                      span(cls := "reputation-score", title := "reputation score 15,994", dir := "ltr", "16k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627206", " ", 
                  div(onclick := "window.location.href='/questions/52627206/get-enum-properties-in-annotation-processor'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "10 views", "10")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627206/get-enum-properties-in-annotation-processor", cls := "question-hyperlink", 
                        "Get enum properties in annotation processor"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-enums t-annotation-processing", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/enums", cls := "post-tag", title := "show questions tagged 'enums'", rel := "tag", "enums"), " ", 
                      a(href := "/questions/tagged/annotation-processing", cls := "post-tag", title := "show questions tagged 'annotation-processing'", rel := "tag", 
                        "annotation-processing"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627206/get-enum-properties-in-annotation-processor", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:37:07Z", cls := "relativetime", "8 mins ago")
                      ), " ", 
                      a(href := "/users/1207670/mistic", "Mistic"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "651"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627201", " ", 
                  div(onclick := "window.location.href='/questions/52627201/login-snapshot-silently'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "11 views", "11")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627201/login-snapshot-silently", cls := "question-hyperlink", 
                        "Login snapshot, silently"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-google-signin t-google-play-games t-snapshot", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/google-signin", cls := "post-tag", title := "show questions tagged 'google-signin'", rel := "tag", "google-signin"), " ", 
                      a(href := "/questions/tagged/google-play-games", cls := "post-tag", title := "show questions tagged 'google-play-games'", rel := "tag", "google-play-games", 
                        img(src := "//i.stack.imgur.com/Ryr18.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/snapshot", cls := "post-tag", title := "show questions tagged 'snapshot'", rel := "tag", "snapshot"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627201/login-snapshot-silently", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:36:51Z", cls := "relativetime", "8 mins ago")
                      ), " ", 
                      a(href := "/users/1540350/modix", "modiX"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1,919"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627194", " ", 
                  div(onclick := "window.location.href='/questions/52627194/search-by-pattern-on-cloud-firestore-collection'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "7 views", "7")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627194/search-by-pattern-on-cloud-firestore-collection", cls := "question-hyperlink", 
                        "Search by pattern on Cloud Firestore collection"
                      )
                    ), " ", 
                    div(cls := "tags t-firebase t-google-cloud-firestore", " ", 
                      a(href := "/questions/tagged/firebase", cls := "post-tag", title := "show questions tagged 'firebase'", rel := "tag", "firebase", 
                        img(src := "//i.stack.imgur.com/5d55j.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/google-cloud-firestore", cls := "post-tag", title := "show questions tagged 'google-cloud-firestore'", rel := "tag", 
                        "google-cloud-firestore"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627194/search-by-pattern-on-cloud-firestore-collection", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:36:23Z", cls := "relativetime", "9 mins ago")
                      ), " ", 
                      a(href := "/users/10122791/augustin-r", "Augustin R"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "773"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627165", " ", 
                  div(onclick := "window.location.href='/questions/52627165/ionic-4-keep-tabs-visible-in-my-whole-application'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "7 views", "7")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627165/ionic-4-keep-tabs-visible-in-my-whole-application", cls := "question-hyperlink", 
                        "Ionic 4 - Keep tabs visible in my whole application"
                      )
                    ), " ", 
                    div(cls := "tags t-ionic-framework t-angular6 t-ionic4", " ", 
                      a(href := "/questions/tagged/ionic-framework", cls := "post-tag", title := "show questions tagged 'ionic-framework'", rel := "tag", "ionic-framework"), " ", 
                      a(href := "/questions/tagged/angular6", cls := "post-tag", title := "show questions tagged 'angular6'", rel := "tag", "angular6"), " ", 
                      a(href := "/questions/tagged/ionic4", cls := "post-tag", title := "show questions tagged 'ionic4'", rel := "tag", "ionic4"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627165/ionic-4-keep-tabs-visible-in-my-whole-application", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:35:02Z", cls := "relativetime", "10 mins ago")
                      ), " ", 
                      a(href := "/users/10014767/nazir-massaad", "Nazir Massaad"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627162", " ", 
                  div(onclick := "window.location.href='/questions/52627162/using-custom-roleclaimtype-on-oauthbearer-middleware'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 views", "2")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627162/using-custom-roleclaimtype-on-oauthbearer-middleware", cls := "question-hyperlink", 
                        "Using custom RoleClaimType on OAuthBearer middleware"
                      )
                    ), " ", 
                    div(cls := "tags t-oauth-2û0 t-aspûnet-web-api2 t-owin t-claims-based-identity", " ", 
                      a(href := "/questions/tagged/oauth-2.0", cls := "post-tag", title := "show questions tagged 'oauth-2.0'", rel := "tag", "oauth-2.0"), " ", 
                      a(href := "/questions/tagged/asp.net-web-api2", cls := "post-tag", title := "show questions tagged 'asp.net-web-api2'", rel := "tag", "asp.net-web-api2"), " ", 
                      a(href := "/questions/tagged/owin", cls := "post-tag", title := "show questions tagged 'owin'", rel := "tag", "owin"), " ", 
                      a(href := "/questions/tagged/claims-based-identity", cls := "post-tag", title := "show questions tagged 'claims-based-identity'", rel := "tag", 
                        "claims-based-identity"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627162/using-custom-roleclaimtype-on-oauthbearer-middleware", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:34:54Z", cls := "relativetime", "10 mins ago")
                      ), " ", 
                      a(href := "/users/1146395/ahmad-ahmadi", "Ahmad Ahmadi"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "144"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627150", " ", 
                  div(onclick := "window.location.href='/questions/52627150/logback-and-x-forwarded-for-is-not-working-properly'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "3 views", "3")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627150/logback-and-x-forwarded-for-is-not-working-properly", cls := "question-hyperlink", 
                        "logback and X-Forwarded-For is not working properly"
                      )
                    ), " ", 
                    div(cls := "tags t-spring-logback", " ", 
                      a(href := "/questions/tagged/spring-logback", cls := "post-tag", title := "show questions tagged 'spring-logback'", rel := "tag", "spring-logback"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627150/logback-and-x-forwarded-for-is-not-working-properly", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:34:14Z", cls := "relativetime", "11 mins ago")
                      ), " ", 
                      a(href := "/users/2210508/jay-patel", "Jay Patel"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "187"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627149", " ", 
                  div(onclick := "window.location.href='/questions/52627149/what-does-creating-a-simple-docker-parent-image-actually-do'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "3 views", "3")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627149/what-does-creating-a-simple-docker-parent-image-actually-do", cls := "question-hyperlink", 
                        "What does creating a simple docker parent image actually do?"
                      )
                    ), " ", 
                    div(cls := "tags t-docker", " ", 
                      a(href := "/questions/tagged/docker", cls := "post-tag", title := "show questions tagged 'docker'", rel := "tag", "docker"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627149/what-does-creating-a-simple-docker-parent-image-actually-do", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:34:13Z", cls := "relativetime", "11 mins ago")
                      ), " ", 
                      a(href := "/users/4021436/irritable-phd-syndrom", 
                        "irritable_phd_syndrom"
                      ), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "951"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52623596", " ", 
                  div(onclick := "window.location.href='/questions/52623596/string-or-string-literal-fails'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "13 views", "13")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52623596/string-or-string-literal-fails", cls := "question-hyperlink", 
                        "String or string literal fails"
                      )
                    ), " ", 
                    div(cls := "tags t-racket", " ", 
                      a(href := "/questions/tagged/racket", cls := "post-tag", title := "show questions tagged 'racket'", rel := "tag", "racket"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52623596/string-or-string-literal-fails/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:34:12Z", cls := "relativetime", "11 mins ago")
                      ), " ", 
                      a(href := "/users/10011003/matt-b", "Matt B."), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "476"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627144", " ", 
                  div(onclick := "window.location.href='/questions/52627144/how-to-add-application-properties-to-embedded-jetty'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "4 views", "4")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627144/how-to-add-application-properties-to-embedded-jetty", cls := "question-hyperlink", 
                        "How to add application properties to embedded jetty?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-embedded-jetty t-properties-file t-jetty-9", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/embedded-jetty", cls := "post-tag", title := "show questions tagged 'embedded-jetty'", rel := "tag", "embedded-jetty"), " ", 
                      a(href := "/questions/tagged/properties-file", cls := "post-tag", title := "show questions tagged 'properties-file'", rel := "tag", "properties-file"), " ", 
                      a(href := "/questions/tagged/jetty-9", cls := "post-tag", title := "show questions tagged 'jetty-9'", rel := "tag", "jetty-9"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627144/how-to-add-application-properties-to-embedded-jetty", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:33:59Z", cls := "relativetime", "11 mins ago")
                      ), " ", 
                      a(href := "/users/4529546/richard", "Richard"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "490"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52608450", " ", 
                  div(onclick := "window.location.href='/questions/52608450/fake-a-bean-with-springboot-test-on-an-integration-test'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "35 views", "35")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52608450/fake-a-bean-with-springboot-test-on-an-integration-test", cls := "question-hyperlink", 
                        "Fake a bean with SpringBoot test on an Integration test"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-spring t-spring-boot t-integration-testing t-spring-test", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/spring", cls := "post-tag", title := "show questions tagged 'spring'", rel := "tag", "spring"), " ", 
                      a(href := "/questions/tagged/spring-boot", cls := "post-tag", title := "show questions tagged 'spring-boot'", rel := "tag", "spring-boot"), " ", 
                      a(href := "/questions/tagged/integration-testing", cls := "post-tag", title := "show questions tagged 'integration-testing'", rel := "tag", "integration-testing"), " ", 
                      a(href := "/questions/tagged/spring-test", cls := "post-tag", title := "show questions tagged 'spring-test'", rel := "tag", "spring-test"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52608450/fake-a-bean-with-springboot-test-on-an-integration-test/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 12:33:55Z", cls := "relativetime", "11 mins ago")
                      ), " ", 
                      a(href := "/users/5333879/borino", "borino"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "556"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627120", " ", 
                  div(onclick := "window.location.href='/questions/52627120/why-does-tfs-2017-gated-build-definition-fails-to-checkin-the-files-belonging-to'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "5 views", "5")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627120/why-does-tfs-2017-gated-build-definition-fails-to-checkin-the-files-belonging-to", cls := "question-hyperlink", 
                        "Why does TFS 2017 Gated Build Definition fails to checkin the files belonging to multiple workspace?"
                      )
                    ), " ", 
                    div(cls := "tags t-azure-pipelines t-tfs2017 t-build-definition t-gated-checkin t-xamlbuild", " ", 
                      a(href := "/questions/tagged/azure-pipelines", cls := "post-tag", title := "show questions tagged 'azure-pipelines'", rel := "tag", "azure-pipelines", 
                        img(src := "//i.stack.imgur.com/jrWQ9.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/tfs2017", cls := "post-tag", title := "show questions tagged 'tfs2017'", rel := "tag", "tfs2017"), " ", 
                      a(href := "/questions/tagged/build-definition", cls := "post-tag", title := "show questions tagged 'build-definition'", rel := "tag", "build-definition"), " ", 
                      a(href := "/questions/tagged/gated-checkin", cls := "post-tag", title := "show questions tagged 'gated-checkin'", rel := "tag", "gated-checkin"), " ", 
                      a(href := "/questions/tagged/xamlbuild", cls := "post-tag", title := "show questions tagged 'xamlbuild'", rel := "tag", "xamlbuild"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627120/why-does-tfs-2017-gated-build-definition-fails-to-checkin-the-files-belonging-to", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:32:12Z", cls := "relativetime", "13 mins ago")
                      ), " ", 
                      a(href := "/users/8189772/srp", "SRP"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "57"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-21937256", " ", 
                  div(onclick := "window.location.href='/questions/21937256/kitkat-downloadmanager-not-returning-correct-column-reason'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 votes", "2")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "131 views", "131")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/21937256/kitkat-downloadmanager-not-returning-correct-column-reason", cls := "question-hyperlink", 
                        "KitKat DownloadManager not returning correct COLUMN_REASON"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-android-download-manager", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/android-download-manager", cls := "post-tag", title := "show questions tagged 'android-download-manager'", rel := "tag", 
                        "android-download-manager"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/21937256/kitkat-downloadmanager-not-returning-correct-column-reason/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 12:31:52Z", cls := "relativetime", "13 mins ago")
                      ), " ", 
                      a(href := "/users/7575254/vijay-anand", "Vijay Anand"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627113", " ", 
                  div(onclick := "window.location.href='/questions/52627113/oracle-apex-show-hide-region-display-selector-and-items-under-it'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "3 views", "3")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627113/oracle-apex-show-hide-region-display-selector-and-items-under-it", cls := "question-hyperlink", 
                        "Oracle APEX - show/hide Region Display Selector and items under it"
                      )
                    ), " ", 
                    div(cls := "tags t-oracle-apex-5û1", " ", 
                      a(href := "/questions/tagged/oracle-apex-5.1", cls := "post-tag", title := "show questions tagged 'oracle-apex-5.1'", rel := "tag", "oracle-apex-5.1"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627113/oracle-apex-show-hide-region-display-selector-and-items-under-it", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:31:44Z", cls := "relativetime", "13 mins ago")
                      ), " ", 
                      a(href := "/users/1812278/coding-duchess", "Coding Duchess"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "2,261"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627072", " ", 
                  div(onclick := "window.location.href='/questions/52627072/why-does-a-pwa-based-on-workbox-produce-an-error-when-launched-from-the-homescre'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "4 views", "4")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627072/why-does-a-pwa-based-on-workbox-produce-an-error-when-launched-from-the-homescre", cls := "question-hyperlink", 
                        "Why does a PWA based on Workbox produce an error when launched from the homescreen on iOS 12?"
                      )
                    ), " ", 
                    div(cls := "tags t-progressive-web-apps t-ios12 t-workbox", " ", 
                      a(href := "/questions/tagged/progressive-web-apps", cls := "post-tag", title := "show questions tagged 'progressive-web-apps'", rel := "tag", 
                        "progressive-web-apps"
                      ), " ", 
                      a(href := "/questions/tagged/ios12", cls := "post-tag", title := "show questions tagged 'ios12'", rel := "tag", "ios12"), " ", 
                      a(href := "/questions/tagged/workbox", cls := "post-tag", title := "show questions tagged 'workbox'", rel := "tag", "workbox"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627072/why-does-a-pwa-based-on-workbox-produce-an-error-when-launched-from-the-homescre", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:29:53Z", cls := "relativetime", "15 mins ago")
                      ), " ", 
                      a(href := "/users/1581278/max-waterman", "Max Waterman"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "96"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626776", " ", 
                  div(onclick := "window.location.href='/questions/52626776/plsql-in-an-resultset-need-to-count-the-values-in-an-single-field'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered-accepted", title := "one of the answers was accepted as the correct answer", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "12 views", "12")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626776/plsql-in-an-resultset-need-to-count-the-values-in-an-single-field", cls := "question-hyperlink", 
                        "plsql in an resultset need to count the values in an single field"
                      )
                    ), " ", 
                    div(cls := "tags t-sql t-oracle", " ", 
                      a(href := "/questions/tagged/sql", cls := "post-tag", title := "show questions tagged 'sql'", rel := "tag", "sql"), " ", 
                      a(href := "/questions/tagged/oracle", cls := "post-tag", title := "show questions tagged 'oracle'", rel := "tag", "oracle"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626776/plsql-in-an-resultset-need-to-count-the-values-in-an-single-field/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 12:29:40Z", cls := "relativetime", "15 mins ago")
                      ), " ", 
                      a(href := "/users/266304/alex-poole", "Alex Poole"), " ", 
                      span(cls := "reputation-score", title := "reputation score 124,896", dir := "ltr", "125k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627061", " ", 
                  div(onclick := "window.location.href='/questions/52627061/react-native-debug-menu-on-an-android-app-which-is-not-using-any-reactactivity'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "7 views", "7")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627061/react-native-debug-menu-on-an-android-app-which-is-not-using-any-reactactivity", cls := "question-hyperlink", 
                        "React-Native Debug menu on an Android app which is not using any ReactActivity"
                      )
                    ), " ", 
                    div(cls := "tags t-android t-reactjs t-react-native t-react-native-android", " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/reactjs", cls := "post-tag", title := "show questions tagged 'reactjs'", rel := "tag", "reactjs"), " ", 
                      a(href := "/questions/tagged/react-native", cls := "post-tag", title := "show questions tagged 'react-native'", rel := "tag", "react-native"), " ", 
                      a(href := "/questions/tagged/react-native-android", cls := "post-tag", title := "show questions tagged 'react-native-android'", rel := "tag", 
                        "react-native-android"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627061/react-native-debug-menu-on-an-android-app-which-is-not-using-any-reactactivity", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:29:26Z", cls := "relativetime", "16 mins ago")
                      ), " ", 
                      a(href := "/users/4549577/manish-patiyal", "Manish Patiyal"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1,894"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624653", " ", 
                  div(onclick := "window.location.href='/questions/52624653/how-to-use-contains-in-jpql'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "11 views", "11")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624653/how-to-use-contains-in-jpql", cls := "question-hyperlink", 
                        "How to use contains in JPQL"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-jpql t-contains", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/jpql", cls := "post-tag", title := "show questions tagged 'jpql'", rel := "tag", "jpql"), " ", 
                      a(href := "/questions/tagged/contains", cls := "post-tag", title := "show questions tagged 'contains'", rel := "tag", "contains"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624653/how-to-use-contains-in-jpql", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:29:24Z", cls := "relativetime", "16 mins ago")
                      ), " ", 
                      a(href := "/users/9240234/springuser", "SpringUser"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "114"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52625737", " ", 
                  div(onclick := "window.location.href='/questions/52625737/converting-word-docx-to-pdf-using-apache-poi-and-itext'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "23 views", "23")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52625737/converting-word-docx-to-pdf-using-apache-poi-and-itext", cls := "question-hyperlink", 
                        "Converting word(.docx) to pdf using Apache POI and itext"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-itext t-apache-poi t-converters", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/itext", cls := "post-tag", title := "show questions tagged 'itext'", rel := "tag", "itext"), " ", 
                      a(href := "/questions/tagged/apache-poi", cls := "post-tag", title := "show questions tagged 'apache-poi'", rel := "tag", "apache-poi"), " ", 
                      a(href := "/questions/tagged/converters", cls := "post-tag", title := "show questions tagged 'converters'", rel := "tag", "converters"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52625737/converting-word-docx-to-pdf-using-apache-poi-and-itext/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:28:50Z", cls := "relativetime", "16 mins ago")
                      ), " ", 
                      a(href := "/users/7189597/sobhan", "Sobhan"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627043", " ", 
                  div(onclick := "window.location.href='/questions/52627043/how-to-temporarily-make-a-single-jupyterlab-pane-take-up-the-full-screen'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "4 views", "4")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627043/how-to-temporarily-make-a-single-jupyterlab-pane-take-up-the-full-screen", cls := "question-hyperlink", 
                        "How to temporarily make a single JupyterLab pane take up the full screen"
                      )
                    ), " ", 
                    div(cls := "tags t-jupyter t-jupyter-lab", " ", 
                      a(href := "/questions/tagged/jupyter", cls := "post-tag", title := "show questions tagged 'jupyter'", rel := "tag", "jupyter"), " ", 
                      a(href := "/questions/tagged/jupyter-lab", cls := "post-tag", title := "show questions tagged 'jupyter-lab'", rel := "tag", "jupyter-lab"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627043/how-to-temporarily-make-a-single-jupyterlab-pane-take-up-the-full-screen", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:28:12Z", cls := "relativetime", "17 mins ago")
                      ), " ", 
                      a(href := "/users/616616/mrocklin", "MRocklin"), " ", 
                      span(cls := "reputation-score", title := "reputation score 23,553", dir := "ltr", "23.6k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627028", " ", 
                  div(onclick := "window.location.href='/questions/52627028/access-multiple-system-using-single-user-credential-in-orangehrm'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 views", "2")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627028/access-multiple-system-using-single-user-credential-in-orangehrm", cls := "question-hyperlink", 
                        "Access multiple system using single user credential in orangehrm"
                      )
                    ), " ", 
                    div(cls := "tags t-orangehrm", " ", 
                      a(href := "/questions/tagged/orangehrm", cls := "post-tag", title := "show questions tagged 'orangehrm'", rel := "tag", "orangehrm"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627028/access-multiple-system-using-single-user-credential-in-orangehrm", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:27:24Z", cls := "relativetime", "18 mins ago")
                      ), " ", 
                      a(href := "/users/7142202/user7142202", "user7142202"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-50384371", " ", 
                  div(onclick := "window.location.href='/questions/50384371/node-soap-clientsslsecuritypfx-403-forbidden'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered-accepted", title := "one of the answers was accepted as the correct answer", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 answers", "2")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "141 views", "141")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/50384371/node-soap-clientsslsecuritypfx-403-forbidden", cls := "question-hyperlink", 
                        "Node soap ClientSSLSecurityPFX - 403 Forbidden"
                      )
                    ), " ", 
                    div(cls := "tags t-nodeûjs t-soap-client t-http-status-code-403 t-pfx t-node-soap", " ", 
                      a(href := "/questions/tagged/node.js", cls := "post-tag", title := "show questions tagged 'node.js'", rel := "tag", "node.js"), " ", 
                      a(href := "/questions/tagged/soap-client", cls := "post-tag", title := "show questions tagged 'soap-client'", rel := "tag", "soap-client"), " ", 
                      a(href := "/questions/tagged/http-status-code-403", cls := "post-tag", title := "show questions tagged 'http-status-code-403'", rel := "tag", 
                        "http-status-code-403"
                      ), " ", 
                      a(href := "/questions/tagged/pfx", cls := "post-tag", title := "show questions tagged 'pfx'", rel := "tag", "pfx"), " ", 
                      a(href := "/questions/tagged/node-soap", cls := "post-tag", title := "show questions tagged 'node-soap'", rel := "tag", "node-soap"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/50384371/node-soap-clientsslsecuritypfx-403-forbidden/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:27:08Z", cls := "relativetime", "18 mins ago")
                      ), " ", 
                      a(href := "/users/2227743/moritz", "Moritz"), " ", 
                      span(cls := "reputation-score", title := "reputation score 55,939", dir := "ltr", "55.9k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52627017", " ", 
                  div(onclick := "window.location.href='/questions/52627017/logging-from-the-spring-integration-dsl-to-the-database'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "4 views", "4")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52627017/logging-from-the-spring-integration-dsl-to-the-database", cls := "question-hyperlink", 
                        "Logging from the Spring Integration DSL to the database"
                      )
                    ), " ", 
                    div(cls := "tags t-spring t-spring-integration t-spring-integration-dsl", " ", 
                      a(href := "/questions/tagged/spring", cls := "post-tag", title := "show questions tagged 'spring'", rel := "tag", "spring"), " ", 
                      a(href := "/questions/tagged/spring-integration", cls := "post-tag", title := "show questions tagged 'spring-integration'", rel := "tag", "spring-integration"), " ", 
                      a(href := "/questions/tagged/spring-integration-dsl", cls := "post-tag", title := "show questions tagged 'spring-integration-dsl'", rel := "tag", 
                        "spring-integration-dsl"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52627017/logging-from-the-spring-integration-dsl-to-the-database", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:26:18Z", cls := "relativetime", "19 mins ago")
                      ), " ", 
                      a(href := "/users/9601701/mike", "Mike"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "31"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52610173", " ", 
                  div(onclick := "window.location.href='/questions/52610173/lagom-begin-processing-of-source-at-startup'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "10 views", "10")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52610173/lagom-begin-processing-of-source-at-startup", cls := "question-hyperlink", 
                        "Lagom begin processing of source at startup"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-lagom", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/lagom", cls := "post-tag", title := "show questions tagged 'lagom'", rel := "tag", "lagom"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52610173/lagom-begin-processing-of-source-at-startup/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:26:17Z", cls := "relativetime", "19 mins ago")
                      ), " ", 
                      a(href := "/users/2883245/erip", "erip"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "9,341"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626616", " ", 
                  div(onclick := "window.location.href='/questions/52626616/netty-client-write-read-operation'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "10 views", "10")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626616/netty-client-write-read-operation", cls := "question-hyperlink", 
                        "Netty - Client Write & Read Operation"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-sockets t-netty", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/sockets", cls := "post-tag", title := "show questions tagged 'sockets'", rel := "tag", "sockets"), " ", 
                      a(href := "/questions/tagged/netty", cls := "post-tag", title := "show questions tagged 'netty'", rel := "tag", "netty"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626616/netty-client-write-read-operation", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:25:06Z", cls := "relativetime", "20 mins ago")
                      ), " ", 
                      a(href := "/users/4551608/harish", "Harish"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "163"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626994", " ", 
                  div(onclick := "window.location.href='/questions/52626994/grouping-toolwindows-in-menu'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "5 views", "5")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626994/grouping-toolwindows-in-menu", cls := "question-hyperlink", 
                        "grouping toolwindows in menu"
                      )
                    ), " ", 
                    div(cls := "tags t-intellij-idea t-intellij-plugin", " ", 
                      a(href := "/questions/tagged/intellij-idea", cls := "post-tag", title := "show questions tagged 'intellij-idea'", rel := "tag", "intellij-idea"), " ", 
                      a(href := "/questions/tagged/intellij-plugin", cls := "post-tag", title := "show questions tagged 'intellij-plugin'", rel := "tag", "intellij-plugin"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626994/grouping-toolwindows-in-menu", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:24:43Z", cls := "relativetime", "20 mins ago")
                      ), " ", 
                      a(href := "/users/7540911/nullman", "Nullman"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1,171"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626978", " ", 
                  div(onclick := "window.location.href='/questions/52626978/zsh-aws-plugin-command-not-found'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "5 views", "5")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626978/zsh-aws-plugin-command-not-found", cls := "question-hyperlink", 
                        "zsh aws plugin command not found"
                      )
                    ), " ", 
                    div(cls := "tags t-zsh t-oh-my-zsh t-zshrc", " ", 
                      a(href := "/questions/tagged/zsh", cls := "post-tag", title := "show questions tagged 'zsh'", rel := "tag", "zsh"), " ", 
                      a(href := "/questions/tagged/oh-my-zsh", cls := "post-tag", title := "show questions tagged 'oh-my-zsh'", rel := "tag", "oh-my-zsh"), " ", 
                      a(href := "/questions/tagged/zshrc", cls := "post-tag", title := "show questions tagged 'zshrc'", rel := "tag", "zshrc"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626978/zsh-aws-plugin-command-not-found", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:23:46Z", cls := "relativetime", "21 mins ago")
                      ), " ", 
                      a(href := "/users/1408347/brian", "Brian"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "2,352"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626966", " ", 
                  div(onclick := "window.location.href='/questions/52626966/scheduled-tasks-are-being-queued-on-windows-server-2012'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "4 views", "4")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626966/scheduled-tasks-are-being-queued-on-windows-server-2012", cls := "question-hyperlink", 
                        "Scheduled tasks are being queued on windows server 2012"
                      )
                    ), " ", 
                    div(cls := "tags t-scheduled-tasks t-windows-server-2012", " ", 
                      a(href := "/questions/tagged/scheduled-tasks", cls := "post-tag", title := "show questions tagged 'scheduled-tasks'", rel := "tag", "scheduled-tasks"), " ", 
                      a(href := "/questions/tagged/windows-server-2012", cls := "post-tag", title := "show questions tagged 'windows-server-2012'", rel := "tag", "windows-server-2012"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626966/scheduled-tasks-are-being-queued-on-windows-server-2012", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:23:05Z", cls := "relativetime", "22 mins ago")
                      ), " ", 
                      a(href := "/users/3729819/sushmit-patil", "Sushmit Patil"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "586"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626961", " ", 
                  div(onclick := "window.location.href='/questions/52626961/cloudant-different-document-structure-in-the-same-db'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "5 views", "5")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626961/cloudant-different-document-structure-in-the-same-db", cls := "question-hyperlink", 
                        "Cloudant different document structure in the same db"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-cloudant", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/cloudant", cls := "post-tag", title := "show questions tagged 'cloudant'", rel := "tag", "cloudant"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626961/cloudant-different-document-structure-in-the-same-db", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:22:55Z", cls := "relativetime", "22 mins ago")
                      ), " ", 
                      a(href := "/users/2490510/user", "User"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "104"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626952", " ", 
                  div(onclick := "window.location.href='/questions/52626952/powerapps-out-of-office-different-user'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "6 views", "6")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626952/powerapps-out-of-office-different-user", cls := "question-hyperlink", 
                        "PowerApps out of office different user"
                      )
                    ), " ", 
                    div(cls := "tags t-office365 t-powerapps", " ", 
                      a(href := "/questions/tagged/office365", cls := "post-tag", title := "show questions tagged 'office365'", rel := "tag", "office365"), " ", 
                      a(href := "/questions/tagged/powerapps", cls := "post-tag", title := "show questions tagged 'powerapps'", rel := "tag", "powerapps"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626952/powerapps-out-of-office-different-user", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:22:26Z", cls := "relativetime", "23 mins ago")
                      ), " ", 
                      a(href := "/users/4245678/neill", "Neill"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "31"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626950", " ", 
                  div(onclick := "window.location.href='/questions/52626950/support-vector-machine-using-previous-predictions'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "4 views", "4")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626950/support-vector-machine-using-previous-predictions", cls := "question-hyperlink", 
                        "Support Vector Machine using previous predictions"
                      )
                    ), " ", 
                    div(cls := "tags t-svm", " ", 
                      a(href := "/questions/tagged/svm", cls := "post-tag", title := "show questions tagged 'svm'", rel := "tag", "svm"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626950/support-vector-machine-using-previous-predictions", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:22:21Z", cls := "relativetime", "23 mins ago")
                      ), " ", 
                      a(href := "/users/10171937/andre-brehme", "Andre Brehme"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626944", " ", 
                  div(onclick := "window.location.href='/questions/52626944/testcafe-tests-on-circleci-do-not-terminate-even-after-having-completed-successf'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 views", "2")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626944/testcafe-tests-on-circleci-do-not-terminate-even-after-having-completed-successf", cls := "question-hyperlink", 
                        "Testcafe tests on CircleCI do not terminate even after having completed successfully"
                      )
                    ), " ", 
                    div(cls := "tags t-circleci t-testcafe", " ", 
                      a(href := "/questions/tagged/circleci", cls := "post-tag", title := "show questions tagged 'circleci'", rel := "tag", "circleci"), " ", 
                      a(href := "/questions/tagged/testcafe", cls := "post-tag", title := "show questions tagged 'testcafe'", rel := "tag", "testcafe"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626944/testcafe-tests-on-circleci-do-not-terminate-even-after-having-completed-successf", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:21:59Z", cls := "relativetime", "23 mins ago")
                      ), " ", 
                      a(href := "/users/2635672/mike-alizade", "Mike Alizade"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "30"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52611148", " ", 
                  div(onclick := "window.location.href='/questions/52611148/why-doesnt-guava-ratelimiter-limit-for-too-large-permits-per-second-anymore'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 votes", "2")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "28 views", "28")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52611148/why-doesnt-guava-ratelimiter-limit-for-too-large-permits-per-second-anymore", cls := "question-hyperlink", 
                        "Why doesn't Guava RateLimiter limit for too large permits per second anymore?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-limit t-guava t-rate-limiting", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/limit", cls := "post-tag", title := "show questions tagged 'limit'", rel := "tag", "limit"), " ", 
                      a(href := "/questions/tagged/guava", cls := "post-tag", title := "show questions tagged 'guava'", rel := "tag", "guava"), " ", 
                      a(href := "/questions/tagged/rate-limiting", cls := "post-tag", title := "show questions tagged 'rate-limiting'", rel := "tag", "rate-limiting"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52611148/why-doesnt-guava-ratelimiter-limit-for-too-large-permits-per-second-anymore/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:21:18Z", cls := "relativetime", "24 mins ago")
                      ), " ", 
                      a(href := "/users/150978/robert", "Robert"), " ", 
                      span(cls := "reputation-score", title := "reputation score 23,979", dir := "ltr", "24k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52601731", " ", 
                  div(onclick := "window.location.href='/questions/52601731/how-to-create-unsafecellc-void-safely'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 votes", "2")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 answers", "2")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "69 views", "69")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52601731/how-to-create-unsafecellc-void-safely", cls := "question-hyperlink", 
                        "How to create UnsafeCell<c_void> safely?"
                      )
                    ), " ", 
                    div(cls := "tags t-rust t-unsafe", " ", 
                      a(href := "/questions/tagged/rust", cls := "post-tag", title := "show questions tagged 'rust'", rel := "tag", "rust"), " ", 
                      a(href := "/questions/tagged/unsafe", cls := "post-tag", title := "show questions tagged 'unsafe'", rel := "tag", "unsafe"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52601731/how-to-create-unsafecellc-void-safely/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:21:11Z", cls := "relativetime", "24 mins ago")
                      ), " ", 
                      a(href := "/users/155423/shepmaster", "Shepmaster"), " ", 
                      span(cls := "reputation-score", title := "reputation score 136,045", dir := "ltr", "136k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626889", " ", 
                  div(onclick := "window.location.href='/questions/52626889/google-fit-automatic-activities-not-found-through-sessionapi'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "3 views", "3")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626889/google-fit-automatic-activities-not-found-through-sessionapi", cls := "question-hyperlink", 
                        "Google fit - automatic activities not found through SessionApi"
                      )
                    ), " ", 
                    div(cls := "tags t-google-fit", " ", 
                      a(href := "/questions/tagged/google-fit", cls := "post-tag", title := "show questions tagged 'google-fit'", rel := "tag", "google-fit", 
                        img(src := "//i.stack.imgur.com/pfGUt.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626889/google-fit-automatic-activities-not-found-through-sessionapi", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:18:27Z", cls := "relativetime", "27 mins ago")
                      ), " ", 
                      a(href := "/users/2076463/qylin", "Qylin"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "808"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52625815", " ", 
                  div(onclick := "window.location.href='/questions/52625815/prometheus-many-to-many-matching-not-allowed'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "14 views", "14")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52625815/prometheus-many-to-many-matching-not-allowed", cls := "question-hyperlink", 
                        "Prometheus - many-to-many matching not allowed"
                      )
                    ), " ", 
                    div(cls := "tags t-prometheus", " ", 
                      a(href := "/questions/tagged/prometheus", cls := "post-tag", title := "show questions tagged 'prometheus'", rel := "tag", "prometheus"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52625815/prometheus-many-to-many-matching-not-allowed", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:12:13Z", cls := "relativetime", "33 mins ago")
                      ), " ", 
                      a(href := "/users/8849741/thomas-de-giacinto", "Thomas De Giacinto"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52449251", " ", 
                  div(onclick := "window.location.href='/questions/52449251/ifttt-download-a-list-of-files-from-a-url'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "13 views", "13")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52449251/ifttt-download-a-list-of-files-from-a-url", cls := "question-hyperlink", 
                        "IFTTT - Download a list of files from a URL"
                      )
                    ), " ", 
                    div(cls := "tags t-zapier t-ifttt", " ", 
                      a(href := "/questions/tagged/zapier", cls := "post-tag", title := "show questions tagged 'zapier'", rel := "tag", "zapier"), " ", 
                      a(href := "/questions/tagged/ifttt", cls := "post-tag", title := "show questions tagged 'ifttt'", rel := "tag", "ifttt"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52449251/ifttt-download-a-list-of-files-from-a-url/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 12:10:43Z", cls := "relativetime", "34 mins ago")
                      ), " ", 
                      a(href := "/users/328848/dean-chalk", "Dean Chalk"), " ", 
                      span(cls := "reputation-score", title := "reputation score 14,555", dir := "ltr", "14.6k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52625853", " ", 
                  div(onclick := "window.location.href='/questions/52625853/block-characters-%c3%ab-%c3%a0-%c3%a9-%c3%a4-etc-from-keypad-in-android'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "31 views", "31")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52625853/block-characters-%c3%ab-%c3%a0-%c3%a9-%c3%a4-etc-from-keypad-in-android", cls := "question-hyperlink", 
                        "block characters ë,à,é,ä etc from keypad in android"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-android-input-filter", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/android-input-filter", cls := "post-tag", title := "show questions tagged 'android-input-filter'", rel := "tag", 
                        "android-input-filter"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52625853/block-characters-%c3%ab-%c3%a0-%c3%a9-%c3%a4-etc-from-keypad-in-android/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 12:05:22Z", cls := "relativetime", "40 mins ago")
                      ), " ", 
                      a(href := "/users/5783253/varma", "Varma"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "108"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626646", " ", 
                  div(onclick := "window.location.href='/questions/52626646/apache-ignite-backed-with-my-sql-failing-to-start-in-client-mode-when-embedded-w'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "12 views", "12")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626646/apache-ignite-backed-with-my-sql-failing-to-start-in-client-mode-when-embedded-w", cls := "question-hyperlink", 
                        "Apache Ignite backed with my SQL failing to start in client mode when embedded with Spring Boot- Showing configuration mismatch"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-spring t-spring-boot t-ignite", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/spring", cls := "post-tag", title := "show questions tagged 'spring'", rel := "tag", "spring"), " ", 
                      a(href := "/questions/tagged/spring-boot", cls := "post-tag", title := "show questions tagged 'spring-boot'", rel := "tag", "spring-boot"), " ", 
                      a(href := "/questions/tagged/ignite", cls := "post-tag", title := "show questions tagged 'ignite'", rel := "tag", "ignite"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626646/apache-ignite-backed-with-my-sql-failing-to-start-in-client-mode-when-embedded-w", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 12:03:53Z", cls := "relativetime", "41 mins ago")
                      ), " ", 
                      a(href := "/users/1843883/user1843883", "user1843883"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "4"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624233", " ", 
                  div(onclick := "window.location.href='/questions/52624233/unescapejava-error-java-lang-illegalargumentexception-less-than-4-hex-digits-i'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "-3 votes", "-3")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "22 views", "22")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624233/unescapejava-error-java-lang-illegalargumentexception-less-than-4-hex-digits-i", cls := "question-hyperlink", 
                        "unescapeJava error “java.lang.IllegalArgumentException: Less than 4 hex digits in unicode value: '\\uD' due to end of CharSequence”"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624233/unescapejava-error-java-lang-illegalargumentexception-less-than-4-hex-digits-i", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 12:03:41Z", cls := "relativetime", "41 mins ago")
                      ), " ", 
                      a(href := "/users/2649012/kling-klang", "Kling Klang"), " ", 
                      span(cls := "reputation-score", title := "reputation score 31,792", dir := "ltr", "31.8k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626573", " ", 
                  div(onclick := "window.location.href='/questions/52626573/jna-how-get-first-item-from-systreeview'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "8 views", "8")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626573/jna-how-get-first-item-from-systreeview", cls := "question-hyperlink", 
                        "JNA - how get first item from SysTreeView"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-jna", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/jna", cls := "post-tag", title := "show questions tagged 'jna'", rel := "tag", "jna"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626573/jna-how-get-first-item-from-systreeview", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 11:59:31Z", cls := "relativetime", "46 mins ago")
                      ), " ", 
                      a(href := "/users/10451007/tkalenko-k-g", "Tkalenko K.G."), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52625569", " ", 
                  div(onclick := "window.location.href='/questions/52625569/problem-mapping-on-android-studio-in-java'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "38 views", "38")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52625569/problem-mapping-on-android-studio-in-java", cls := "question-hyperlink", 
                        "Problem mapping on Android Studio in Java"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-android-studio", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/android-studio", cls := "post-tag", title := "show questions tagged 'android-studio'", rel := "tag", "android-studio", 
                        img(src := "//i.stack.imgur.com/xqoqk.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52625569/problem-mapping-on-android-studio-in-java/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 11:59:12Z", cls := "relativetime", "46 mins ago")
                      ), " ", 
                      a(href := "/users/6928237/ruann-reis", "Ruann Reis"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "145"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626563", " ", 
                  div(onclick := "window.location.href='/questions/52626563/include-inheritance-constraint-in-swift-generic-types'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "11 views", "11")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626563/include-inheritance-constraint-in-swift-generic-types", cls := "question-hyperlink", 
                        "Include inheritance constraint in Swift Generic types"
                      )
                    ), " ", 
                    div(cls := "tags t-swift t-generics", " ", 
                      a(href := "/questions/tagged/swift", cls := "post-tag", title := "show questions tagged 'swift'", rel := "tag", "swift"), " ", 
                      a(href := "/questions/tagged/generics", cls := "post-tag", title := "show questions tagged 'generics'", rel := "tag", "generics"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626563/include-inheritance-constraint-in-swift-generic-types", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 11:58:46Z", cls := "relativetime", "46 mins ago")
                      ), " ", 
                      a(href := "/users/964961/fguchelaar", "fguchelaar"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "4,106"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626531", " ", 
                  div(onclick := "window.location.href='/questions/52626531/instrumenting-a-multithreaded-application-in-java'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "22 views", "22")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626531/instrumenting-a-multithreaded-application-in-java", cls := "question-hyperlink", 
                        "Instrumenting a multithreaded application in java"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-multithreading t-instrumentation t-javassist", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/multithreading", cls := "post-tag", title := "show questions tagged 'multithreading'", rel := "tag", "multithreading"), " ", 
                      a(href := "/questions/tagged/instrumentation", cls := "post-tag", title := "show questions tagged 'instrumentation'", rel := "tag", "instrumentation"), " ", 
                      a(href := "/questions/tagged/javassist", cls := "post-tag", title := "show questions tagged 'javassist'", rel := "tag", "javassist"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626531/instrumenting-a-multithreaded-application-in-java", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 11:57:31Z", cls := "relativetime", "48 mins ago")
                      ), " ", 
                      a(href := "/users/10174193/ash", "Ash"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "6"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-50448861", " ", 
                  div(onclick := "window.location.href='/questions/50448861/how-to-resolve-java-lang-throwable'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "239 views", "239")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/50448861/how-to-resolve-java-lang-throwable", cls := "question-hyperlink", 
                        "How to resolve java.lang.Throwable?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-throwable", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/throwable", cls := "post-tag", title := "show questions tagged 'throwable'", rel := "tag", "throwable"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/50448861/how-to-resolve-java-lang-throwable", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 11:56:18Z", cls := "relativetime", "49 mins ago")
                      ), " ", 
                      a(href := "/users/4855610/imen-gharsalli", "Imen Gharsalli"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "184"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624012", " ", 
                  div(onclick := "window.location.href='/questions/52624012/conditionalonproperty-default-bean-work-not-currectly'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "18 views", "18")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624012/conditionalonproperty-default-bean-work-not-currectly", cls := "question-hyperlink", 
                        "@ConditionalOnProperty default bean work not currectly"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-spring t-spring-boot", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/spring", cls := "post-tag", title := "show questions tagged 'spring'", rel := "tag", "spring"), " ", 
                      a(href := "/questions/tagged/spring-boot", cls := "post-tag", title := "show questions tagged 'spring-boot'", rel := "tag", "spring-boot"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624012/conditionalonproperty-default-bean-work-not-currectly/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 11:55:31Z", cls := "relativetime", "50 mins ago")
                      ), " ", 
                      a(href := "/users/8189903/star67", "star67"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "33"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624537", " ", 
                  div(onclick := "window.location.href='/questions/52624537/java-google-photos-api-creation-date-of-album'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "16 views", "16")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624537/java-google-photos-api-creation-date-of-album", cls := "question-hyperlink", 
                        "Java Google Photos API - creation date of album"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-google-photos-api", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/google-photos-api", cls := "post-tag", title := "show questions tagged 'google-photos-api'", rel := "tag", "google-photos-api"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624537/java-google-photos-api-creation-date-of-album", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 11:55:19Z", cls := "relativetime", "50 mins ago")
                      ), " ", 
                      a(href := "/users/6057787/irshad-ahmed", "Irshad Ahmed"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "349"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52522988", " ", 
                  div(onclick := "window.location.href='/questions/52522988/alert-sometimes-gives-ridiculously-small-windows-how-to-fix-this'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 votes", "2")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 answers", "2")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "52 views", "52")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52522988/alert-sometimes-gives-ridiculously-small-windows-how-to-fix-this", cls := "question-hyperlink", 
                        "`Alert` sometimes gives ridiculously small windows - how to fix this?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-javafx t-openjfx", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/javafx", cls := "post-tag", title := "show questions tagged 'javafx'", rel := "tag", "javafx"), " ", 
                      a(href := "/questions/tagged/openjfx", cls := "post-tag", title := "show questions tagged 'openjfx'", rel := "tag", "openjfx"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52522988/alert-sometimes-gives-ridiculously-small-windows-how-to-fix-this/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 11:55:13Z", cls := "relativetime", "50 mins ago")
                      ), " ", 
                      a(href := "/users/4815321/mr-mcwolf", "mr mcwolf"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1,249"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52584625", " ", 
                  div(onclick := "window.location.href='/questions/52584625/android-studio-gradle-sync-failed-could-not-run-jvm-from-the-selected-jdk'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "123 views", "123")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52584625/android-studio-gradle-sync-failed-could-not-run-jvm-from-the-selected-jdk", cls := "question-hyperlink", 
                        "Android Studio: “Gradle sync failed: Could not run JVM from the selected JDK.”"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-android-gradle", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/android-gradle", cls := "post-tag", title := "show questions tagged 'android-gradle'", rel := "tag", "android-gradle"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52584625/android-studio-gradle-sync-failed-could-not-run-jvm-from-the-selected-jdk/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 11:51:39Z", cls := "relativetime", "53 mins ago")
                      ), " ", 
                      a(href := "/users/4782446/v%c3%adctor-l%c3%b3pez", "Víctor López"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "519"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626437", " ", 
                  div(onclick := "window.location.href='/questions/52626437/docker-service-health-check-is-not-working-for-spring-boot-application'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "16 views", "16")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626437/docker-service-health-check-is-not-working-for-spring-boot-application", cls := "question-hyperlink", 
                        "Docker service health check is not working for spring boot application"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-docker t-spring-boot", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/docker", cls := "post-tag", title := "show questions tagged 'docker'", rel := "tag", "docker"), " ", 
                      a(href := "/questions/tagged/spring-boot", cls := "post-tag", title := "show questions tagged 'spring-boot'", rel := "tag", "spring-boot"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626437/docker-service-health-check-is-not-working-for-spring-boot-application", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 11:51:20Z", cls := "relativetime", "54 mins ago")
                      ), " ", 
                      a(href := "/users/5672261/nitin-vavdiya", "Nitin Vavdiya"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "480"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52625709", " ", 
                  div(onclick := "window.location.href='/questions/52625709/no-line-found-error-while-executing-the-below-codescanner'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "27 views", "27")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52625709/no-line-found-error-while-executing-the-below-codescanner", cls := "question-hyperlink", 
                        "No line found error while executing the below code(Scanner)"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-selenium", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/selenium", cls := "post-tag", title := "show questions tagged 'selenium'", rel := "tag", "selenium"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52625709/no-line-found-error-while-executing-the-below-codescanner/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 11:46:06Z", cls := "relativetime", "59 mins ago")
                      ), " ", 
                      a(href := "/users/10390139/elpolloloco", "elPolloLoco"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "61"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626254", " ", 
                  div(onclick := "window.location.href='/questions/52626254/spring-boot-multiple-jndi-connections'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 votes", "2")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "22 views", "22")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626254/spring-boot-multiple-jndi-connections", cls := "question-hyperlink", 
                        "Spring boot multiple jndi connections"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-spring t-spring-boot", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/spring", cls := "post-tag", title := "show questions tagged 'spring'", rel := "tag", "spring"), " ", 
                      a(href := "/questions/tagged/spring-boot", cls := "post-tag", title := "show questions tagged 'spring-boot'", rel := "tag", "spring-boot"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626254/spring-boot-multiple-jndi-connections", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 11:40:16Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/3458271/user3458271", "user3458271"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "86"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624290", " ", 
                  div(onclick := "window.location.href='/questions/52624290/need-help-to-fix-this-switch-statement-working'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "48 views", "48")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624290/need-help-to-fix-this-switch-statement-working", cls := "question-hyperlink", 
                        "Need help to fix this switch statement working"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-switch-statement", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/switch-statement", cls := "post-tag", title := "show questions tagged 'switch-statement'", rel := "tag", "switch-statement"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624290/need-help-to-fix-this-switch-statement-working", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 11:39:55Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/10449288/benno", "BENNO"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "4"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52623913", " ", 
                  div(onclick := "window.location.href='/questions/52623913/how-do-i-group-parent-child-entities-using-java-8'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "49 views", "49")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52623913/how-do-i-group-parent-child-entities-using-java-8", cls := "question-hyperlink", 
                        "How do I group parent child entities using java 8"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-java-8", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/java-8", cls := "post-tag", title := "show questions tagged 'java-8'", rel := "tag", "java-8"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52623913/how-do-i-group-parent-child-entities-using-java-8/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 11:36:52Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/1059372/eugene", "Eugene"), " ", 
                      span(cls := "reputation-score", title := "reputation score 61,793", dir := "ltr", "61.8k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52313966", " ", 
                  div(onclick := "window.location.href='/questions/52313966/integrating-javax-validation-with-javafx'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "38 views", "38")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52313966/integrating-javax-validation-with-javafx", cls := "question-hyperlink", 
                        "Integrating javax validation with JavaFX"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-spring t-spring-boot t-javafx t-bean-validation", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/spring", cls := "post-tag", title := "show questions tagged 'spring'", rel := "tag", "spring"), " ", 
                      a(href := "/questions/tagged/spring-boot", cls := "post-tag", title := "show questions tagged 'spring-boot'", rel := "tag", "spring-boot"), " ", 
                      a(href := "/questions/tagged/javafx", cls := "post-tag", title := "show questions tagged 'javafx'", rel := "tag", "javafx"), " ", 
                      a(href := "/questions/tagged/bean-validation", cls := "post-tag", title := "show questions tagged 'bean-validation'", rel := "tag", "bean-validation"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52313966/integrating-javax-validation-with-javafx/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 11:36:49Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/8780684/martin", "Martin"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "127"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52625712", " ", 
                  div(onclick := "window.location.href='/questions/52625712/how-do-i-use-hamcrests-contains-method-with-junit-5'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "16 views", "16")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52625712/how-do-i-use-hamcrests-contains-method-with-junit-5", cls := "question-hyperlink", 
                        "How do I use Hamcrests contains method with JUnit 5?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-junit4 t-hamcrest t-junit5", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/junit4", cls := "post-tag", title := "show questions tagged 'junit4'", rel := "tag", "junit4"), " ", 
                      a(href := "/questions/tagged/hamcrest", cls := "post-tag", title := "show questions tagged 'hamcrest'", rel := "tag", "hamcrest"), " ", 
                      a(href := "/questions/tagged/junit5", cls := "post-tag", title := "show questions tagged 'junit5'", rel := "tag", "junit5"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52625712/how-do-i-use-hamcrests-contains-method-with-junit-5/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 11:35:07Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/1602555/karol-dowbecki", "Karol Dowbecki"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "9,764"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626144", " ", 
                  div(onclick := "window.location.href='/questions/52626144/unable-to-wget-after-migration-from-win2008-to-win2016'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "6 views", "6")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626144/unable-to-wget-after-migration-from-win2008-to-win2016", cls := "question-hyperlink", 
                        "Unable to wget after migration from win2008 to win2016"
                      )
                    ), " ", 
                    div(cls := "tags t-windows t-wget t-windows-server-2016", " ", 
                      a(href := "/questions/tagged/windows", cls := "post-tag", title := "show questions tagged 'windows'", rel := "tag", "windows"), " ", 
                      a(href := "/questions/tagged/wget", cls := "post-tag", title := "show questions tagged 'wget'", rel := "tag", "wget"), " ", 
                      a(href := "/questions/tagged/windows-server-2016", cls := "post-tag", title := "show questions tagged 'windows-server-2016'", rel := "tag", "windows-server-2016"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626144/unable-to-wget-after-migration-from-win2008-to-win2016", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 11:33:49Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/7661411/sudhakar", "sudhakar"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "11"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624282", " ", 
                  div(onclick := "window.location.href='/questions/52624282/how-to-specify-path-annotation-in-rest-api-java-to-accept-any-path'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "14 views", "14")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624282/how-to-specify-path-annotation-in-rest-api-java-to-accept-any-path", cls := "question-hyperlink", 
                        "How to specify path annotation in rest api java to accept any path?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-jax-rs", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/jax-rs", cls := "post-tag", title := "show questions tagged 'jax-rs'", rel := "tag", "jax-rs"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624282/how-to-specify-path-annotation-in-rest-api-java-to-accept-any-path/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 11:31:06Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/2698859/irfan-bhindawala", "Irfan Bhindawala"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "277"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52621303", " ", 
                  div(onclick := "window.location.href='/questions/52621303/spring-aop-is-powerless-for-classes-with-interfaces'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "3 votes", "3")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered-accepted", title := "one of the answers was accepted as the correct answer", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "49 views", "49")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52621303/spring-aop-is-powerless-for-classes-with-interfaces", cls := "question-hyperlink", 
                        "Spring AOP is powerless for classes with interfaces"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-spring t-inheritance t-aop t-spring-aop", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/spring", cls := "post-tag", title := "show questions tagged 'spring'", rel := "tag", "spring"), " ", 
                      a(href := "/questions/tagged/inheritance", cls := "post-tag", title := "show questions tagged 'inheritance'", rel := "tag", "inheritance"), " ", 
                      a(href := "/questions/tagged/aop", cls := "post-tag", title := "show questions tagged 'aop'", rel := "tag", "aop"), " ", 
                      a(href := "/questions/tagged/spring-aop", cls := "post-tag", title := "show questions tagged 'spring-aop'", rel := "tag", "spring-aop"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52621303/spring-aop-is-powerless-for-classes-with-interfaces/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 11:30:03Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/10449701/yevgeni-n", "Yevgeni N"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "18"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52626067", " ", 
                  div(onclick := "window.location.href='/questions/52626067/microsoft-graph-api-insufficient-privileges-when-trying-to-update-mobilephone'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 votes", "2")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "10 views", "10")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52626067/microsoft-graph-api-insufficient-privileges-when-trying-to-update-mobilephone", cls := "question-hyperlink", 
                        "Microsoft Graph API Insufficient privileges when trying to update 'mobilePhone'"
                      )
                    ), " ", 
                    div(cls := "tags t-azure-active-directory t-microsoft-graph", " ", 
                      a(href := "/questions/tagged/azure-active-directory", cls := "post-tag", title := "show questions tagged 'azure-active-directory'", rel := "tag", 
                        "azure-active-directory", 
                        img(src := "//i.stack.imgur.com/9J8MK.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/microsoft-graph", cls := "post-tag", title := "show questions tagged 'microsoft-graph'", rel := "tag", "microsoft-graph"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52626067/microsoft-graph-api-insufficient-privileges-when-trying-to-update-mobilephone", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 11:27:54Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/10450763/rinaldsr", "RinaldsR"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "11"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52595778", " ", 
                  div(onclick := "window.location.href='/questions/52595778/error-unable-to-write-bundle-to-storage-android-firebase-kotlin'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "37 views", "37")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52595778/error-unable-to-write-bundle-to-storage-android-firebase-kotlin", cls := "question-hyperlink", 
                        "Error: Unable to write bundle to storage Android Firebase Kotlin"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-firebase t-firebase-realtime-database t-kotlin", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/firebase", cls := "post-tag", title := "show questions tagged 'firebase'", rel := "tag", "firebase", 
                        img(src := "//i.stack.imgur.com/5d55j.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/firebase-realtime-database", cls := "post-tag", title := "show questions tagged 'firebase-realtime-database'", rel := "tag", 
                        "firebase-realtime-database"
                      ), " ", 
                      a(href := "/questions/tagged/kotlin", cls := "post-tag", title := "show questions tagged 'kotlin'", rel := "tag", "kotlin", 
                        img(src := "//i.stack.imgur.com/NT6zO.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52595778/error-unable-to-write-bundle-to-storage-android-firebase-kotlin/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 11:27:39Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/5246885/alex-mamo", "Alex Mamo"), " ", 
                      span(cls := "reputation-score", title := "reputation score 31,495", dir := "ltr", "31.5k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52625428", " ", 
                  div(onclick := "window.location.href='/questions/52625428/how-to-write-a-conditional-query-string-using-unirest-in-java'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "12 views", "12")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52625428/how-to-write-a-conditional-query-string-using-unirest-in-java", cls := "question-hyperlink", 
                        "how to write a conditional query string using unirest in java"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-json t-httpresponse t-unirest t-requestûquerystring", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/json", cls := "post-tag", title := "show questions tagged 'json'", rel := "tag", "json"), " ", 
                      a(href := "/questions/tagged/httpresponse", cls := "post-tag", title := "show questions tagged 'httpresponse'", rel := "tag", "httpresponse"), " ", 
                      a(href := "/questions/tagged/unirest", cls := "post-tag", title := "show questions tagged 'unirest'", rel := "tag", "unirest"), " ", 
                      a(href := "/questions/tagged/request.querystring", cls := "post-tag", title := "show questions tagged 'request.querystring'", rel := "tag", "request.querystring"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52625428/how-to-write-a-conditional-query-string-using-unirest-in-java", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 11:03:34Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/10450750/zaha", "Zaha"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "6"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52620406", " ", 
                  div(onclick := "window.location.href='/questions/52620406/junit-mockito-always-returns-false-in-assertequals-when-comparing-boolean-values'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 votes", "2")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 answers", "2")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "28 views", "28")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52620406/junit-mockito-always-returns-false-in-assertequals-when-comparing-boolean-values", cls := "question-hyperlink", 
                        "JUnit Mockito always returns false in assertEquals when comparing boolean values"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-junit t-mockito t-assert", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/junit", cls := "post-tag", title := "show questions tagged 'junit'", rel := "tag", "junit"), " ", 
                      a(href := "/questions/tagged/mockito", cls := "post-tag", title := "show questions tagged 'mockito'", rel := "tag", "mockito"), " ", 
                      a(href := "/questions/tagged/assert", cls := "post-tag", title := "show questions tagged 'assert'", rel := "tag", "assert"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52620406/junit-mockito-always-returns-false-in-assertequals-when-comparing-boolean-values/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 10:56:47Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/1987514/ben-green", "Ben Green"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "2,783"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52625433", " ", 
                  div(onclick := "window.location.href='/questions/52625433/ranging-and-monitoring-stops-after-a-while-even-with-foreground-service'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "11 views", "11")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52625433/ranging-and-monitoring-stops-after-a-while-even-with-foreground-service", cls := "question-hyperlink", 
                        "Ranging and monitoring stops after a while even with foreground service"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-android-studio t-ibeacon t-altbeacon", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/android-studio", cls := "post-tag", title := "show questions tagged 'android-studio'", rel := "tag", "android-studio", 
                        img(src := "//i.stack.imgur.com/xqoqk.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/ibeacon", cls := "post-tag", title := "show questions tagged 'ibeacon'", rel := "tag", "ibeacon"), " ", 
                      a(href := "/questions/tagged/altbeacon", cls := "post-tag", title := "show questions tagged 'altbeacon'", rel := "tag", "altbeacon"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52625433/ranging-and-monitoring-stops-after-a-while-even-with-foreground-service", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 10:50:50Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/7617328/divye-shah", "Divye Shah"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "53"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52625092", " ", 
                  div(onclick := "window.location.href='/questions/52625092/preview-differs-from-saved-picture'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "24 views", "24")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52625092/preview-differs-from-saved-picture", cls := "question-hyperlink", 
                        "Preview differs from saved picture"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-android-camera2", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/android-camera2", cls := "post-tag", title := "show questions tagged 'android-camera2'", rel := "tag", "android-camera2"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52625092/preview-differs-from-saved-picture/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 10:50:18Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/9093630/ahmad-darwesh", "Ahmad Darwesh"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "61"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52544664", " ", 
                  div(onclick := "window.location.href='/questions/52544664/update-document-in-couchbase-server-5-1-1'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "27 views", "27")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52544664/update-document-in-couchbase-server-5-1-1", cls := "question-hyperlink", 
                        "update document in couchbase server 5.1.1"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-couchbase", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/couchbase", cls := "post-tag", title := "show questions tagged 'couchbase'", rel := "tag", "couchbase"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52544664/update-document-in-couchbase-server-5-1-1/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 10:49:13Z", cls := "relativetime", "1 hour ago")
                      ), " ", 
                      a(href := "/users/4688115/graham-pople", "Graham Pople"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "11"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52623744", " ", 
                  div(onclick := "window.location.href='/questions/52623744/expandablelistview-inside-a-table-layout'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "22 views", "22")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52623744/expandablelistview-inside-a-table-layout", cls := "question-hyperlink", 
                        "ExpandableListView Inside a Table Layout"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-android-tablelayout t-expandablelistadapter", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/android-tablelayout", cls := "post-tag", title := "show questions tagged 'android-tablelayout'", rel := "tag", "android-tablelayout"), " ", 
                      a(href := "/questions/tagged/expandablelistadapter", cls := "post-tag", title := "show questions tagged 'expandablelistadapter'", rel := "tag", 
                        "expandablelistadapter"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52623744/expandablelistview-inside-a-table-layout", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 10:42:00Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/2649012/kling-klang", "Kling Klang"), " ", 
                      span(cls := "reputation-score", title := "reputation score 31,792", dir := "ltr", "31.8k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52625238", " ", 
                  div(onclick := "window.location.href='/questions/52625238/intellij-wants-to-create-new-classes-under-test-root-instead-of-main'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "21 views", "21")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52625238/intellij-wants-to-create-new-classes-under-test-root-instead-of-main", cls := "question-hyperlink", 
                        "IntelliJ wants to create new classes under test root instead of main"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-intellij-idea", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/intellij-idea", cls := "post-tag", title := "show questions tagged 'intellij-idea'", rel := "tag", "intellij-idea"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52625238/intellij-wants-to-create-new-classes-under-test-root-instead-of-main", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 10:40:00Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/1185421/seppo420", "Seppo420"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "667"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52623326", " ", 
                  div(onclick := "window.location.href='/questions/52623326/jjwt-parse-dont-fail-if-signingkey-is-slightly-different'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "3 votes", "3")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered-accepted", title := "one of the answers was accepted as the correct answer", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "24 views", "24")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52623326/jjwt-parse-dont-fail-if-signingkey-is-slightly-different", cls := "question-hyperlink", 
                        "JJWT parse dont fail if SigningKey is slightly different"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-jwt t-jjwt", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/jwt", cls := "post-tag", title := "show questions tagged 'jwt'", rel := "tag", "jwt"), " ", 
                      a(href := "/questions/tagged/jjwt", cls := "post-tag", title := "show questions tagged 'jjwt'", rel := "tag", "jjwt"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52623326/jjwt-parse-dont-fail-if-signingkey-is-slightly-different/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 10:37:23Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/1426227/cassio-mazzochi-molin", 
                        "Cassio Mazzochi Molin"
                      ), " ", 
                      span(cls := "reputation-score", title := "reputation score 51,440", dir := "ltr", "51.4k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52623141", " ", 
                  div(onclick := "window.location.href='/questions/52623141/how-to-open-particular-activity-using-shortcut'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "38 views", "38")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52623141/how-to-open-particular-activity-using-shortcut", cls := "question-hyperlink", 
                        "How to open particular activity using shortcut?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-android-shortcut", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/android-shortcut", cls := "post-tag", title := "show questions tagged 'android-shortcut'", rel := "tag", "android-shortcut"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52623141/how-to-open-particular-activity-using-shortcut/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 10:26:43Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/8693592/rishav-singla", "Rishav Singla"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "154"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52619452", " ", 
                  div(onclick := "window.location.href='/questions/52619452/snakeyaml-unable-to-find-property-error'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "20 views", "20")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52619452/snakeyaml-unable-to-find-property-error", cls := "question-hyperlink", 
                        "SnakeYaml “Unable to find property error”"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-yaml t-snakeyaml", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/yaml", cls := "post-tag", title := "show questions tagged 'yaml'", rel := "tag", "yaml"), " ", 
                      a(href := "/questions/tagged/snakeyaml", cls := "post-tag", title := "show questions tagged 'snakeyaml'", rel := "tag", "snakeyaml"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52619452/snakeyaml-unable-to-find-property-error/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 10:21:02Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/6337748/notionquest", "notionquest"), " ", 
                      span(cls := "reputation-score", title := "reputation score 14,996", dir := "ltr", "15k"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624705", " ", 
                  div(onclick := "window.location.href='/questions/52624705/flink-how-to-use-a-thin-jar-instead-of-a-fat-jar'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "17 views", "17")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624705/flink-how-to-use-a-thin-jar-instead-of-a-fat-jar", cls := "question-hyperlink", 
                        "Flink: How to use a thin jar instead of a fat jar?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-apache-flink t-uberjar", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/apache-flink", cls := "post-tag", title := "show questions tagged 'apache-flink'", rel := "tag", "apache-flink"), " ", 
                      a(href := "/questions/tagged/uberjar", cls := "post-tag", title := "show questions tagged 'uberjar'", rel := "tag", "uberjar"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624705/flink-how-to-use-a-thin-jar-instead-of-a-fat-jar", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 10:11:47Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/7713802/harshith-bolar", "Harshith Bolar"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "79"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624629", " ", 
                  div(onclick := "window.location.href='/questions/52624629/kafka-old-consumer-rebalance-issue'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "13 views", "13")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624629/kafka-old-consumer-rebalance-issue", cls := "question-hyperlink", 
                        "Kafka old consumer rebalance issue"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-apache-kafka t-apache-zookeeper", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/apache-kafka", cls := "post-tag", title := "show questions tagged 'apache-kafka'", rel := "tag", "apache-kafka"), " ", 
                      a(href := "/questions/tagged/apache-zookeeper", cls := "post-tag", title := "show questions tagged 'apache-zookeeper'", rel := "tag", "apache-zookeeper"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624629/kafka-old-consumer-rebalance-issue", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 10:08:10Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/1783166/redspider", "redspider"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "188"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624118", " ", 
                  div(onclick := "window.location.href='/questions/52624118/spring-async-advicemode-aspectj-triggers-bean-creation-errors'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "20 views", "20")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624118/spring-async-advicemode-aspectj-triggers-bean-creation-errors", cls := "question-hyperlink", 
                        "Spring @Async AdviceMode.ASPECTJ triggers bean creation errors"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-spring t-spring-boot t-aop t-aspectj", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/spring", cls := "post-tag", title := "show questions tagged 'spring'", rel := "tag", "spring"), " ", 
                      a(href := "/questions/tagged/spring-boot", cls := "post-tag", title := "show questions tagged 'spring-boot'", rel := "tag", "spring-boot"), " ", 
                      a(href := "/questions/tagged/aop", cls := "post-tag", title := "show questions tagged 'aop'", rel := "tag", "aop"), " ", 
                      a(href := "/questions/tagged/aspectj", cls := "post-tag", title := "show questions tagged 'aspectj'", rel := "tag", "aspectj"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624118/spring-async-advicemode-aspectj-triggers-bean-creation-errors", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 10:04:58Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/5288347/sviatlana", "Sviatlana"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "354"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624421", " ", 
                  div(onclick := "window.location.href='/questions/52624421/validating-json-request-against-yaml-schema'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "-1 votes", "-1")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "13 views", "13")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624421/validating-json-request-against-yaml-schema", cls := "question-hyperlink", 
                        "validating json request against yaml schema"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-json t-jackson t-yaml t-swagger", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/json", cls := "post-tag", title := "show questions tagged 'json'", rel := "tag", "json"), " ", 
                      a(href := "/questions/tagged/jackson", cls := "post-tag", title := "show questions tagged 'jackson'", rel := "tag", "jackson"), " ", 
                      a(href := "/questions/tagged/yaml", cls := "post-tag", title := "show questions tagged 'yaml'", rel := "tag", "yaml"), " ", 
                      a(href := "/questions/tagged/swagger", cls := "post-tag", title := "show questions tagged 'swagger'", rel := "tag", "swagger"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624421/validating-json-request-against-yaml-schema", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 10:04:14Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/10450554/medepalli-pratap", "MEDEPALLI PRATAP"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52549242", " ", 
                  div(onclick := "window.location.href='/questions/52549242/i-want-to-aggregate-the-data-depending-on-the-updated-on-timestamp-in-jpql-but-i'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "35 views", "35")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52549242/i-want-to-aggregate-the-data-depending-on-the-updated-on-timestamp-in-jpql-but-i", cls := "question-hyperlink", 
                        "I want to aggregate the data depending on the updated_on timestamp in jpql but invalid keyword INTERVAL"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-postgresql t-spring-boot t-hql t-jpql", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/postgresql", cls := "post-tag", title := "show questions tagged 'postgresql'", rel := "tag", "postgresql"), " ", 
                      a(href := "/questions/tagged/spring-boot", cls := "post-tag", title := "show questions tagged 'spring-boot'", rel := "tag", "spring-boot"), " ", 
                      a(href := "/questions/tagged/hql", cls := "post-tag", title := "show questions tagged 'hql'", rel := "tag", "hql"), " ", 
                      a(href := "/questions/tagged/jpql", cls := "post-tag", title := "show questions tagged 'jpql'", rel := "tag", "jpql"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52549242/i-want-to-aggregate-the-data-depending-on-the-updated-on-timestamp-in-jpql-but-i/?lastactivity", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 10:03:29Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/4116955/mahesh-h-viraktamath", 
                        "Mahesh H Viraktamath"
                      ), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "232"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624060", " ", 
                  div(onclick := "window.location.href='/questions/52624060/selenium-chromedriver-losing-window-handles-org-openqa-selenium-nosuchwindowexc'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "15 views", "15")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624060/selenium-chromedriver-losing-window-handles-org-openqa-selenium-nosuchwindowexc", cls := "question-hyperlink", 
                        "Selenium chromedriver losing window handles. org.openqa.selenium.NoSuchWindowException: no such window error"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-selenium t-selenium-chromedriver", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/selenium", cls := "post-tag", title := "show questions tagged 'selenium'", rel := "tag", "selenium"), " ", 
                      a(href := "/questions/tagged/selenium-chromedriver", cls := "post-tag", title := "show questions tagged 'selenium-chromedriver'", rel := "tag", 
                        "selenium-chromedriver"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624060/selenium-chromedriver-losing-window-handles-org-openqa-selenium-nosuchwindowexc", cls := "started-link", "modified ", 
                        span(title := "2018-10-03 10:02:36Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/8578250/harit-yadav", "Harit Yadav"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624444", " ", 
                  div(onclick := "window.location.href='/questions/52624444/hard-constraint-optaplanner'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "8 views", "8")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624444/hard-constraint-optaplanner", cls := "question-hyperlink", 
                        "Hard Constraint Optaplanner"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-optashift-employee-rostering", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/optashift-employee-rostering", cls := "post-tag", title := "show questions tagged 'optashift-employee-rostering'", rel := "tag", 
                        "optashift-employee-rostering"
                      ), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624444/hard-constraint-optaplanner", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 09:57:57Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/9231830/rod182211", "Rod182211"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624408", " ", 
                  div(onclick := "window.location.href='/questions/52624408/disabling-the-warnings-in-weka-autoweka-when-running-from-cli'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 votes", "0")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "7 views", "7")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624408/disabling-the-warnings-in-weka-autoweka-when-running-from-cli", cls := "question-hyperlink", 
                        "Disabling the warnings in weka/autoweka when running from cli?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-weka", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/weka", cls := "post-tag", title := "show questions tagged 'weka'", rel := "tag", "weka"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624408/disabling-the-warnings-in-weka-autoweka-when-running-from-cli", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 09:56:03Z", cls := "relativetime", "2 hours ago")
                      ), " ", 
                      a(href := "/users/10450560/geoff", "Geoff"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "1"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52623631", " ", 
                  div(onclick := "window.location.href='/questions/52623631/replacing-a-mocked-spring-boot-controller-with-the-actual-controller'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "2 votes", "2")
                      ), " ", 
                      div("votes"), " "
                    ), " ", 
                    div(cls := "status answered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 answer", "1")
                      ), " ", 
                      div("answer"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "22 views", "22")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52623631/replacing-a-mocked-spring-boot-controller-with-the-actual-controller", cls := "question-hyperlink", 
                        "Replacing a Mocked Spring Boot Controller with the actual Controller"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-unit-testing t-spring-boot t-junit t-mockito", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/unit-testing", cls := "post-tag", title := "show questions tagged 'unit-testing'", rel := "tag", "unit-testing"), " ", 
                      a(href := "/questions/tagged/spring-boot", cls := "post-tag", title := "show questions tagged 'spring-boot'", rel := "tag", "spring-boot"), " ", 
                      a(href := "/questions/tagged/junit", cls := "post-tag", title := "show questions tagged 'junit'", rel := "tag", "junit"), " ", 
                      a(href := "/questions/tagged/mockito", cls := "post-tag", title := "show questions tagged 'mockito'", rel := "tag", "mockito"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52623631/replacing-a-mocked-spring-boot-controller-with-the-actual-controller/?lastactivity", cls := "started-link", "answered ", 
                        span(title := "2018-10-03 09:44:47Z", cls := "relativetime", "3 hours ago")
                      ), " ", 
                      a(href := "/users/5747715/jorge-c", "Jorge C"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "174"), " "
                    ), " "
                  ), " "
                ), " ", 
                div(cls := "question-summary narrow", id := "question-summary-52624157", " ", 
                  div(onclick := "window.location.href='/questions/52624157/what-exactly-is-cellinfo-and-how-to-use-getallcellinfo-to-get-info-just-about-on'", cls := "cp", " ", 
                    div(cls := "votes", " ", 
                      div(cls := "mini-counts", 
                        span(title := "1 vote", "1")
                      ), " ", 
                      div("vote"), " "
                    ), " ", 
                    div(cls := "status unanswered", " ", 
                      div(cls := "mini-counts", 
                        span(title := "0 answers", "0")
                      ), " ", 
                      div("answers"), " "
                    ), " ", 
                    div(cls := "views", " ", 
                      div(cls := "mini-counts", 
                        span(title := "15 views", "15")
                      ), " ", 
                      div("views"), " "
                    ), " "
                  ), " ", 
                  div(cls := "summary", " ", 
                    h3(
                      a(href := "/questions/52624157/what-exactly-is-cellinfo-and-how-to-use-getallcellinfo-to-get-info-just-about-on", cls := "question-hyperlink", 
                        "What exactly is CellInfo and how to use getAllCellInfo to get info just about one connectivity type?"
                      )
                    ), " ", 
                    div(cls := "tags t-java t-android t-telephonymanager t-cellinfo", " ", 
                      a(href := "/questions/tagged/java", cls := "post-tag", title := "show questions tagged 'java'", rel := "tag", "java"), " ", 
                      a(href := "/questions/tagged/android", cls := "post-tag", title := "show questions tagged 'android'", rel := "tag", "android", 
                        img(src := "//i.stack.imgur.com/tKsDb.png", attr("height") := "16", attr("width") := "18", alt := "", cls := "sponsor-tag-img")
                      ), " ", 
                      a(href := "/questions/tagged/telephonymanager", cls := "post-tag", title := "show questions tagged 'telephonymanager'", rel := "tag", "telephonymanager"), " ", 
                      a(href := "/questions/tagged/cellinfo", cls := "post-tag", title := "show questions tagged 'cellinfo'", rel := "tag", "cellinfo"), " "
                    ), " ", 
                    div(cls := "started", " ", 
                      a(href := "/questions/52624157/what-exactly-is-cellinfo-and-how-to-use-getallcellinfo-to-get-info-just-about-on", cls := "started-link", "asked ", 
                        span(title := "2018-10-03 09:42:28Z", cls := "relativetime", "3 hours ago")
                      ), " ", 
                      a(href := "/users/10187988/maicake", "Maicake"), " ", 
                      span(cls := "reputation-score", title := "reputation score ", dir := "ltr", "34"), " "
                    ), " "
                  ), " "
                ), " "
              ), " "
            ), " "
          ), " ", 
          br(cls := "cbt"), " ", 
          h2(cls := "bottom-notice", data("loc") := "2", 
            "Looking for more? Browse the ", 
            a(href := "/questions", 
              "complete list of questions"
            ), ", or ", 
            a(href := "/tags", "popular tags"), ". Help us answer ", 
            a(href := "/unanswered", 
              "unanswered questions"
            ), "."
          ), " ", 
          script(
            raw(" StackExchange.ready(function() { StackExchange.question.initShareLinks(); }); ")
          ), " "
        ), " ", 
        div(id := "sidebar", " ", 
          div(cls := "module community-bulletin", data("tracker") := "cb=1", " ", 
            div(cls := "related", " ", 
              div(cls := "bulletin-title", " Featured on Meta "), " ", 
              hr(), " ", 
              div(cls := "spacer", " ", 
                div(cls := "bulletin-item-type", " ", 
                  a(href := "https://meta.stackexchange.com/questions/315662/responsive-design-released-for-all-beta-undesigned-sites", cls := "question-hyperlink", data("ga") := """["community bulletin board","Featured on Meta","https://meta.stackexchange.com/questions/315662/responsive-design-released-for-all-beta-undesigned-sites",null,null]""", " ", 
                    div(cls := "favicon favicon-stackexchangemeta", title := "Meta Stack Exchange"), " "
                  ), " "
                ), " ", 
                div(cls := "bulletin-item-content", " ", 
                  a(href := "https://meta.stackexchange.com/questions/315662/responsive-design-released-for-all-beta-undesigned-sites", cls := "question-hyperlink", data("ga") := """["community bulletin board","Featured on Meta","https://meta.stackexchange.com/questions/315662/responsive-design-released-for-all-beta-undesigned-sites",null,null]""", 
                    "Responsive design released for all Beta & Undesigned sites"
                  ), " "
                ), " ", 
                br(cls := "cbt"), " "
              ), " ", 
              div(cls := "spacer", " ", 
                div(cls := "bulletin-item-type", " ", 
                  a(href := "https://meta.stackoverflow.com/questions/373920/vsts-has-been-renamed-to-azure-devops-lets-talk-about-some-tags", cls := "question-hyperlink", data("ga") := """["community bulletin board","Featured on Meta","https://meta.stackoverflow.com/questions/373920/vsts-has-been-renamed-to-azure-devops-lets-talk-about-some-tags",null,null]""", " ", 
                    div(cls := "favicon favicon-stackoverflowmeta", title := "Meta Stack Overflow"), " "
                  ), " "
                ), " ", 
                div(cls := "bulletin-item-content", " ", 
                  a(href := "https://meta.stackoverflow.com/questions/373920/vsts-has-been-renamed-to-azure-devops-lets-talk-about-some-tags", cls := "question-hyperlink", data("ga") := """["community bulletin board","Featured on Meta","https://meta.stackoverflow.com/questions/373920/vsts-has-been-renamed-to-azure-devops-lets-talk-about-some-tags",null,null]""", 
                    "VSTS has been renamed to Azure DevOps - let's talk about some tags"
                  ), " "
                ), " ", 
                br(cls := "cbt"), " "
              ), " ", 
              div(cls := "spacer", " ", 
                div(cls := "bulletin-item-type", " ", 
                  a(href := "https://meta.stackoverflow.com/questions/374198/the-deep-tag-is-being-burned", cls := "question-hyperlink", data("ga") := """["community bulletin board","Featured on Meta","https://meta.stackoverflow.com/questions/374198/the-deep-tag-is-being-burned",null,null]""", " ", 
                    div(cls := "favicon favicon-stackoverflowmeta", title := "Meta Stack Overflow"), " "
                  ), " "
                ), " ", 
                div(cls := "bulletin-item-content", " ", 
                  a(href := "https://meta.stackoverflow.com/questions/374198/the-deep-tag-is-being-burned", cls := "question-hyperlink", data("ga") := """["community bulletin board","Featured on Meta","https://meta.stackoverflow.com/questions/374198/the-deep-tag-is-being-burned",null,null]""", 
                    "The [deep] tag is being burned"
                  ), " "
                ), " ", 
                br(cls := "cbt"), " "
              ), " ", 
              div(cls := "spacer", " ", 
                div(cls := "bulletin-item-type", " ", 
                  a(href := "https://meta.stackoverflow.com/questions/374617/happy-10th-anniversary-stack-overflow-commence-au-festival", cls := "question-hyperlink", data("ga") := """["community bulletin board","Featured on Meta","https://meta.stackoverflow.com/questions/374617/happy-10th-anniversary-stack-overflow-commence-au-festival",null,null]""", " ", 
                    div(cls := "favicon favicon-stackoverflowmeta", title := "Meta Stack Overflow"), " "
                  ), " "
                ), " ", 
                div(cls := "bulletin-item-content", " ", 
                  a(href := "https://meta.stackoverflow.com/questions/374617/happy-10th-anniversary-stack-overflow-commence-au-festival", cls := "question-hyperlink", data("ga") := """["community bulletin board","Featured on Meta","https://meta.stackoverflow.com/questions/374617/happy-10th-anniversary-stack-overflow-commence-au-festival",null,null]""", 
                    "Happy 10th anniversary Stack Overflow! Commence … au festival!"
                  ), " "
                ), " ", 
                br(cls := "cbt"), " "
              ), " ", 
              div(cls := "bulletin-title", " Hot Meta Posts "), " ", 
              hr(), " ", 
              div(cls := "spacer", " ", 
                div(cls := "bulletin-item-type", " ", 
                  span(title := "Vote score (upvotes - downvotes)", "14"), " "
                ), " ", 
                div(cls := "bulletin-item-content", " ", 
                  a(href := "https://meta.stackoverflow.com/questions/374746/flag-declined-on-a-question-re-reviewers-that-accepted-a-bad-imo-edit", cls := "question-hyperlink", data("ga") := """["community bulletin board","Hot Meta Posts","https://meta.stackoverflow.com/questions/374746/flag-declined-on-a-question-re-reviewers-that-accepted-a-bad-imo-edit",null,null]""", 
                    "Flag declined on a question re: reviewers that accepted a bad (IMO) edit"
                  ), " "
                ), " ", 
                br(cls := "cbt"), " "
              ), " "
            ), " "
          ), " ", 
          div(cls := "module js-tag-preferences-container", " ", 
            div(cls := "s-sidebarwidget mb16", " ", 
              div(cls := "s-sidebarwidget--header grid", " ", 
                span(cls := "grid--cell mr4", 
                  tag("svg")(aria.hidden := "true", cls := "svg-icon iconEye", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                    tag("path")(attr("d") := "M9.06 3C4 3 1 9 1 9s3 6 8.06 6C14 15 17 9 17 9s-3-6-7.94-6zM9 13a4 4 0 1 1 0-8 4 4 0 0 1 0 8zm2-4a2 2 0 0 1-2 2 2 2 0 0 1-2-2 2 2 0 0 1 2-2 2 2 0 0 1 2 2z")
                  )
                ), " ", 
                span(cls := "grid--cell fl1", " Watched Tags "), " ", 
                a(cls := "js-edit-watched-tags grid--cell ml12 d-none", href := "/users/tag-notifications/1445898#watching-1", "edit"), " "
              ), " ", 
              div(cls := "s-sidebarwidget--content fd-column", " ", 
                div(cls := "js-watched-tag-list grid gs4 py4 fw-wrap d-none", " ", 
                  script(tpe := "text/html", cls := "js-tag-template", 
                    raw("<div class=\"js-tag grid--cell \">"), 
                    raw("""<a href="/questions/tagged/template" class="post-tag" title="show questions tagged &#39;template&#39;" rel="tag">template"""), raw("</a>"), raw("</div>")
                  ), " "
                ), " ", 
                div(cls := "js-add-watched-container"), " ", 
                div(cls := "js-show-add-watched-container grid fd-column ta-center ai-center gsy gs16 mx-auto", " ", 
                  img(cls := "grid--cell", alt := "Tag watching", src := "https://cdn.sstatic.net/Img/ico-binoculars.svg?v=d4dbaac4eec9"), " ", 
                  p(cls := "grid--cell wmx6 fc-black-300", 
                    " Watch tags to curate your list of questions. "
                  ), " ", 
                  a(cls := "js-show-add-watched grid--cell s-btn s-btn__filled", 
                    tag("svg")(aria.hidden := "true", cls := "svg-icon iconEye", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                      tag("path")(attr("d") := "M9.06 3C4 3 1 9 1 9s3 6 8.06 6C14 15 17 9 17 9s-3-6-7.94-6zM9 13a4 4 0 1 1 0-8 4 4 0 0 1 0 8zm2-4a2 2 0 0 1-2 2 2 2 0 0 1-2-2 2 2 0 0 1 2-2 2 2 0 0 1 2 2z")
                    ), " Watch a tag"
                  ), " "
                ), " "
              ), " "
            ), " ", 
            div(cls := "-ignored s-sidebarwidget", " ", 
              div(cls := "s-sidebarwidget--header grid", " ", 
                span(cls := "grid--cell mr4", 
                  tag("svg")(aria.hidden := "true", cls := "svg-icon iconNotInterested", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                    tag("path")(attr("d") := "M5.52 13.89a6 6 0 0 0 8.37-8.37L5.52 13.9zm-1.4-1.41l8.36-8.37a6 6 0 0 0-8.37 8.37zM9 17A8 8 0 1 1 9 1a8 8 0 0 1 0 16z")
                  )
                ), " ", 
                span(cls := "grid--cell fl1", "Ignored Tags"), " ", 
                a(cls := "js-edit-ignored-tags grid--cell ml12 d-none", href := "/users/tag-notifications/1445898#ignored-1", "edit"), " "
              ), " ", 
              div(cls := "s-sidebarwidget--content fd-column", " ", 
                div(cls := "js-ignored-tag-list grid gs4 py4 fw-wrap ai-baseline d-none", " ", 
                  script(tpe := "text/html", cls := "js-tag-template", 
                    raw("<div class=\"js-tag grid--cell \">"), 
                    raw("""<a href="/questions/tagged/template" class="post-tag" title="show questions tagged &#39;template&#39;" rel="tag">template"""), raw("</a>"), raw("</div>")
                  ), " "
                ), " ", 
                div(cls := "js-add-ignored-container"), " ", 
                a(cls := "js-show-add-ignored none", "Add an ignored tag"), " ", 
                div(cls := "js-ignored-edit-visible mt8 d-none", " ", 
                  div(cls := "grid ai-center", " ", 
                    div(cls := "grid--cell mr8", 
                      input(tpe := "radio", name := "hideIgnored", cls := "js-hide-ignored s-radio", id := "ba169140-2085-4051-b8a5-28bb5619f469-on")
                    ), " ", 
                    label(`for` := "ba169140-2085-4051-b8a5-28bb5619f469-on", cls := "grid--cell s-label fs-body1 fw-normal", 
                      "Hide questions in your ignored tags"
                    ), " "
                  ), " ", 
                  div(cls := "grid ai-center", " ", 
                    div(cls := "grid--cell mr8", 
                      input(tpe := "radio", name := "hideIgnored", cls := "js-dim-ignored s-radio", id := "ba169140-2085-4051-b8a5-28bb5619f469-off", checked)
                    ), " ", 
                    label(`for` := "ba169140-2085-4051-b8a5-28bb5619f469-off", cls := "grid--cell s-label fs-body1 fw-normal", 
                      "Gray out questions in your ignored tags"
                    ), " "
                  ), " "
                ), " "
              ), " "
            ), " "
          ), " ", 
          script(
            raw(""" StackExchange.ready(function() {
                    StackExchange.tagPreferences.applyPrefs(true, [], undefined);
                }); """)
          ), 
          div(id := "dfp-tsb", cls := "everyonelovesstackoverflow everyoneloves__top-sidebar"), " ", 
          div(id := "hireme"), " ", 
          script(
            raw(";try{(function(a){function b(a){return'string'==typeof a?document.getElementById(a):a}function c(a){return a=b(a),!!a&&'none'===getComputedStyle(a).display}function d(a){return!c(a)}function e(a){return!!a}function f(a){return /^\\s*$/.test(b(a).innerHTML)}function g(a){var b=a.style;b.height=b.maxHeight=b.minHeight='auto',b.display='none',[].forEach.call(a.children,g)}function h(a,b){var c;return function(){return a&&(c=a.call(b||this,arguments),a=null),c}}function i(a){var b=document.createElement('script');b.src=a,document.body.appendChild(b)}function j(a){return k([],a)}function k(a,b){return a.push=function(a){return b(),delete this.push,this.push(a)},a}function l(){try{return!new Function('return async()=>{};')}catch(a){return!0}}function m(){return'undefined'!=typeof googletag&&!!googletag.apiReady}function n(){m()||(googletag={cmd:j(A)})}function o(){var a=document.createElement('div');a.className='adsbox',a.id='clc-abd',a.style.position='absolute',a.style.pointerEvents='none',a.innerHTML='&nbsp;',document.body.appendChild(a)}function p(a){var b=a.serviceName,c=a.slot,d=a.lineItemId;try{var e=c.getSlotElementId(),f=[];e||f.push('id=0');var h=document.getElementById(e);if(!e||h?h.hasAttribute('data-clc-stalled')&&f.push('st=1'):f.push('el=0'),0!==f.length)return void B(f.join('&'));-1===x.dh.indexOf(d)?h.setAttribute('data-clc-prefilled','true'):g(h),h.setAttribute('data-clc-ready','true')}catch(a){var i=document.querySelector('#dfp-tsb, #dfp-isb, #clc-tsb');i&&i.setAttribute('data-clc-ready','true'),B('e=1')}}function q(){return Object.keys(F.ids)}function r(a){var b=F.ids[a],c=F.slots[b];'function'==typeof c&&(c=c(a));return{path:'/'+C+'/'+E+'/'+b+'/'+D,sizes:c,zone:b}}function s(a){return!(clc.collapse&&void 0!==clc.collapse[a])||!!clc.collapse[a]}function t(a,b){'dfp-isb'===a&&b.setTargeting('Sidebar',['Inline']),'dfp-tsb'===a&&b.setTargeting('Sidebar',['Right']);var c=r(a),d=c.path,e=c.sizes,f=c.zone,g=googletag.defineSlot(d,e,a);s(f)&&g.setCollapseEmptyDiv(!0,!0),g.addService(b),!1}function u(b){var c=a.dfp&&a.dfp.targeting||{};Object.keys(c).forEach(function(a){b.setTargeting(a,c[a])})}function v(a){var g=a.map(b).filter(e);return{eligible:g.filter(f).filter(d).map(function(a){return a.id}),ineligible:g.filter(c)}}function w(b){if(void 0===b&&(b=q()),!m())return n(),void googletag.cmd.push(function(){return w(b)});var c=v(b),d=c.eligible,e=c.ineligible;if(e.forEach(g),0!==d.length){o(),googletag.destroySlots();var f=googletag.pubads();f.enableSingleRequest(),a.sreEvent||(f.addEventListener('slotRenderEnded',p),a.sreEvent=!0),u(f),d.forEach(function(a){return t(a,f)}),googletag.enableServices(),d.forEach(function(a){googletag.display(a)})}}var x=function(a){for(var b=[],c=1;c"), 
            raw("<arguments.length;c++)b[c-1]=arguments[c];for(var d,e=0,f=b;e"), 
            raw("""<f.length;e++)for(var g in d=f[e],d)a[g]=d[g];return a}({"lib":"https://cdn.sstatic.net/clc/clc.min.js?v=04d772c81312","style":"https://cdn.sstatic.net/clc/styles/clc.min.css?v=1db48f495ba1","u":"https://clc.stackoverflow.com/markup.js","wa":true,"kt":2000,"tto":true,"h":"clc.stackoverflow.com","allowed":"^(((talent\\\\.)?stackoverflow)|(blog\\\\.codinghorror)|(serverfault|askubuntu)|([^\\\\.]+\\\\.stackexchange))\\\\.com$","wv":true,"al":false,"dh":[4385506061,4386578282,4386579572]},a.options||{}),y=h(function(){var a=x.lib;l()&&(a=a.replace(/(\\.min)?\\.js(\\?v=[0-9a-fA-F]+)?$/,'.ie$1.js$2')),i(a)}),z=a.cmd||[];Array.isArray(z)&&(0"""), 
            raw("""<z.length?y():k(z,y));var A=h(function(){i('https://www.googletagservices.com/tag/js/gpt.js')}),B=function(a){new Image().src='https://'+x.h+'/stalled.gif?'+a},C='248424177',D=/^\\/tags\\//.test(location.pathname)||/^\\/questions\\/tagged\\//.test(location.pathname)?'tag-pages':'question-pages',E=location.hostname;var F={slots:{lb:[[728,90]],mlb:[[728,90]],sb:function(a){return'dfp-tsb'===a?[[300,250],[300,600]]:[[300,250]]},"tag-sponsorship":[[730,135]],"mobile-below-question":[[320,50],[300,250]]},ids:{"dfp-tlb":'lb',"dfp-mlb":'mlb',"dfp-tsb":'sb',"dfp-isb":'sb',"dfp-tag":'tag-sponsorship',"dfp-m-aq":'mobile-below-question',"clc-tlb":'lb',"clc-mlb":'mlb',"clc-tsb":'sb'}};(function(){var b=x.al;b&&z.push(function(){return a.load()})})(),n(),a.dfp={load:w},a.options=x,a.cmd=z})(this.clc=this.clc||{})}catch(a){window.console.error(a)}""")
          ), " ", 
          script(
            raw(""" var clc = clc || {};
            clc.collapse = { sb: !0,'tag-sponsorship':!0,lb:!1,mlb:!1,'mobile-below-question':!0};
            clc.cmd = clc.cmd || [];
            clc.cmd.push(function () { window.clc_request='At5-jx0uKdYIc7cXAAAAAAACAAAAAQAAAAMAAAAAAEhsDkULf3IXaH8'; clc.load(); });
            clc.dfp = clc.dfp || {};
            clc.dfp.targeting = {Registered:['true'],Reputation:['200']};

            var googletag = googletag || {};
            googletag.cmd = googletag.cmd || [];
            googletag.cmd.push(function () { clc.dfp.load(); }); """)
          ), 
          div(id := "hot-network-questions", cls := "module tex2jax_ignore", " ", 
            h4(" ", 
              a(href := "https://stackexchange.com/questions?tab=hot", cls := "js-gps-track s-link s-link__inherit", data("gps-track") := "posts_hot_network.click({ item_type:1, location:8 })", 
                " Hot Network Questions "
              ), " "
            ), " ", 
            ul(" ", 
              li(" ", 
                div(cls := "favicon favicon-photo", title := "Photography Stack Exchange"), 
                a(href := "https://photo.stackexchange.com/questions/101844/how-can-i-get-the-horizon-and-the-lighthouse-both-level-in-my-photo", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:61 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " How can I get the horizon and the lighthouse both level in my photo? "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-travel", title := "Travel Stack Exchange"), 
                a(href := "https://travel.stackexchange.com/questions/123253/traveling-europe-from-us-on-valid-schengen-visa-and-expired-us-visa", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:273 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Traveling Europe from US on valid Schengen visa and expired US visa "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-superuser", title := "Super User"), 
                a(href := "https://superuser.com/questions/1362964/when-doubling-internet-connection-speed-will-my-effective-in-house-bandwidth-al", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:3 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " When doubling Internet connection speed, will my effective in-house bandwidth also double? "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-apple", title := "Ask Different"), 
                a(href := "https://apple.stackexchange.com/questions/338257/what-does-a-dmg-verify", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:118 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " What does a .dmg verify? "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-math", title := "Mathematics Stack Exchange"), 
                a(href := "https://math.stackexchange.com/questions/2940216/question-about-the-chain-rule", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:69 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Question about the chain rule. "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-workplace", title := "The Workplace Stack Exchange"), 
                a(href := "https://workplace.stackexchange.com/questions/119816/top-developer-doing-more-home-office-than-allowed", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:423 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Top developer doing more home office than allowed "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-scifi", title := "Science Fiction & Fantasy Stack Exchange"), 
                a(href := "https://scifi.stackexchange.com/questions/195901/in-star-trek-v-why-was-the-klingon-bird-of-prey-hanging-close-to-earth", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:186 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " In Star Trek V, why was the Klingon Bird-Of-Prey hanging close to Earth? "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-retrocomputing", title := "Retrocomputing Stack Exchange"), 
                a(href := "https://retrocomputing.stackexchange.com/questions/7810/why-not-use-fractions-instead-of-floating-point", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:648 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Why not use fractions instead of floating point? "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-aviation", title := "Aviation Stack Exchange"), 
                a(href := "https://aviation.stackexchange.com/questions/55473/why-dont-jetliners-maneuver-to-avoid-a-bird-strike-if-spotted-in-time", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:528 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Why don't jetliners maneuver to avoid a bird strike if spotted in time? "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-dba", title := "Database Administrators Stack Exchange"), 
                a(href := "https://dba.stackexchange.com/questions/219149/is-using-multiple-unique-constrains-on-a-single-table-considered-bad-design", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:182 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Is using multiple unique constrains on a single table considered bad design? "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-electronics", title := "Electrical Engineering Stack Exchange"), 
                a(href := "https://electronics.stackexchange.com/questions/399020/led-not-achieving-max-current", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:135 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " LED not achieving max current "
                ), " "
              ), " ", 
              li(" ", 
                div(cls := "favicon favicon-stackoverflow", title := "Stack Overflow"), 
                a(href := "https://stackoverflow.com/questions/52607611/why-does-for-loop-behave-differently-when-migrating-vb-net-code-to-c", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:1 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Why does for loop behave differently when migrating VB.NET code to C#? "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-rpg", title := "Role-playing Games Stack Exchange"), 
                a(href := "https://rpg.stackexchange.com/questions/132870/how-to-conceal-being-a-vampire-in-a-party-of-clerics-and-paladins", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:122 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " How to conceal being a vampire in a party of Clerics and Paladins "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-retrocomputing", title := "Retrocomputing Stack Exchange"), 
                a(href := "https://retrocomputing.stackexchange.com/questions/7817/who-set-the-640k-limit", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:648 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Who set the 640K limit? "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-codegolf", title := "Programming Puzzles & Code Golf Stack Exchange"), 
                a(href := "https://codegolf.stackexchange.com/questions/173104/the-work-day-countdown", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:200 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " The Work Day Countdown "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-tex", title := "TeX - LaTeX Stack Exchange"), 
                a(href := "https://tex.stackexchange.com/questions/453572/mismatched-braces-in-subscript-and-superscript", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:85 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Mismatched braces in subscript and superscript "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-emacs", title := "Emacs Stack Exchange"), 
                a(href := "https://emacs.stackexchange.com/questions/45129/encoding-issue-for-french-text", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:583 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Encoding issue for French text "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-workplace", title := "The Workplace Stack Exchange"), 
                a(href := "https://workplace.stackexchange.com/questions/120096/young-colleague-wants-to-resign-i-would-like-him-to-stay", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:423 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Young colleague wants to resign; I would like him to stay "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-academia", title := "Academia Stack Exchange"), 
                a(href := "https://academia.stackexchange.com/questions/117799/just-starting-in-grad-school-i-havent-heard-from-my-advisor-in-three-weeks", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:415 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Just starting in grad school, I haven't heard from my advisor in three weeks … "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-physics", title := "Physics Stack Exchange"), 
                a(href := "https://physics.stackexchange.com/questions/431861/if-an-apple-is-magnified-to-the-size-of-the-earth-then-the-atoms-in-the-apple-a", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:151 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " If an apple is magnified to the size of the earth, then the atoms in the apple are approximately the size of the original apple "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-money", title := "Personal Finance & Money Stack Exchange"), 
                a(href := "https://money.stackexchange.com/questions/100649/how-far-in-advance-can-insider-sell-their-own-companys-stock", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:93 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " How far in advance can insider sell their own company's stock? "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-rpg", title := "Role-playing Games Stack Exchange"), 
                a(href := "https://rpg.stackexchange.com/questions/132771/what-to-do-about-the-npc-massacre", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:122 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " What to do about the NPC massacre? "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-physics", title := "Physics Stack Exchange"), 
                a(href := "https://physics.stackexchange.com/questions/432126/can-a-black-coating-increase-the-efficiency-of-a-heat-dissipator", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:151 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Can a black coating increase the efficiency of a heat dissipator? "
                ), " "
              ), " ", 
              li(cls := "dno js-hidden", " ", 
                div(cls := "favicon favicon-cooking", title := "Seasoned Advice"), 
                a(href := "https://cooking.stackexchange.com/questions/92570/is-it-possible-to-remove-the-smell-from-rice-mistakenly-stored-in-a-detergent-bo", cls := "js-gps-track question-hyperlink mb0", data("gps-track") := "site.switch({ item_type:8, target_site:49 }); posts_hot_network.click({ item_type:2, location:8 })", 
                  " Is it possible to remove the smell from rice mistakenly stored in a detergent box? "
                ), " "
              ), " "
            ), " ", 
            a(href := "#", cls := "show-more js-show-more js-gps-track", data("gps-track") := "posts_hot_network.click({ item_type:3, location:8 })", 
              " more hot questions "
            ), " "
          ), " ", 
          div(id := "feed-link", " ", 
            a(href := "/feeds", title := "the 30 most recent questions", " ", 
              tag("svg")(aria.hidden := "true", cls := "svg-icon fc-orange-400 iconRss", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                tag("path")(attr("d") := "M1 3c0-1.1.9-2 2-2h12a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V3zm14.5 12C15.5 8.1 9.9 2.5 3 2.5V5a10 10 0 0 1 10 10h2.5zm-5 0A7.5 7.5 0 0 0 3 7.5V10a5 5 0 0 1 5 5h2.5zm-5 0A2.5 2.5 0 0 0 3 12.5V15h2.5z")
              ), 
              " recent questions feed "
            ), " "
          ), " "
        ), " "
      ), " "
    ), " ", 
    footer(id := "footer", cls := "site-footer js-footer", role := "contentinfo", " ", 
      div(cls := "site-footer--container", " ", 
        div(cls := "site-footer--logo", " ", 
          a(href := "https://stackoverflow.com", 
            tag("svg")(aria.hidden := "true", cls := "svg-icon native iconLogoGlyphMd", attr("width") := "32", attr("height") := "37", attr("viewBox") := "0 0 32 37", 
              tag("g")(
                tag("path")(attr("fill") := "#BCBBBB", attr("d") := "M26 33v-9h4v13H0V24h4v9z"), 
                tag("path")(attr("d") := "M23.1 25.99l.68-2.95-16.1-3.35L7 23l16.1 2.99zM9.1 15.2l15 7 1.4-3-15-7-1.4 3zm4.2-7.4L26 18.4l2.1-2.5L15.4 5.3l-2.1 2.5zM21.5 0l-2.7 2 9.9 13.3 2.7-2L21.5 0zM7 30h16v-3H7v3z", attr("fill") := "#F48024")
              )
            )
          ), " "
        ), " ", 
        tag("nav")(cls := "site-footer--nav", " ", 
          div(cls := "site-footer--col site-footer--col__visible js-footer-col", data("name") := "default", " ", 
            h5(cls := "-title", 
              a(href := "https://stackoverflow.com", cls := "js-gps-track", data("gps-track") := "footer.click({ location: 1, link: 15})", "Stack Overflow")
            ), " ", 
            ul(cls := "-list js-primary-footer-links", " ", 
              li(cls := "-item", 
                a(href := "/questions", cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 16})", "Questions")
              ), " ", 
              li(cls := "-item", 
                a(href := "https://stackoverflow.com/jobs", cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 17})", "Jobs")
              ), " ", 
              li(cls := "-item", 
                a(href := "https://stackoverflow.com/jobs/directory/developer-jobs", cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 11})", 
                  "Developer Jobs Directory"
                )
              ), " ", 
              li(cls := "-item", 
                a(href := "https://stackoverflow.com/jobs/salary", cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 28})", "Salary Calculator")
              ), " ", 
              li(cls := "-item", 
                a(href := "/help", cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 3 })", "Help")
              ), " ", 
              li(cls := "-item", 
                a(onclick := "StackExchange.switchMobile(\"on\")", cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 12 })", "Mobile")
              ), " "
            ), " "
          ), " ", 
          div(cls := "site-footer--col site-footer--col__visible js-footer-col", data("name") := "default", " ", 
            h5(cls := "-title", 
              a(href := "https://www.stackoverflowbusiness.com", cls := "js-gps-track", data("gps-track") := "footer.click({ location: 1, link: 19 })", "Products")
            ), " ", 
            ul(cls := "-list", " ", 
              li(cls := "-item", 
                a(href := "https://stackoverflow.com/teams", cls := "js-gps-track -link", data("ga") := """["teams traffic","footer - site nav","stackoverflow.com/teams",null,{"dimension4":"teams"}]""", data("gps-track") := "footer.click({ location: 1, link: 29 })", "Teams")
              ), " ", 
              li(cls := "-item", 
                a(href := "https://www.stackoverflowbusiness.com/talent", cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 20 })", "Talent")
              ), " ", 
              li(cls := "-item", 
                a(href := "https://www.stackoverflowbusiness.com/advertise", cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 21 })", "Engagement")
              ), " ", 
              li(cls := "-item", 
                a(href := "https://stackoverflow.com/enterprise", cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 22 })", "Enterprise")
              ), " "
            ), " "
          ), " ", 
          div(cls := "site-footer--col site-footer--col__visible js-footer-col", data("name") := "default", " ", 
            h5(cls := "-title", 
              a(cls := "js-gps-track", data("gps-track") := "footer.click({ location: 1, link: 1 })", href := "https://stackoverflow.com/company/about", "Company")
            ), " ", 
            ul(cls := "-list", " ", 
              li(cls := "-item", 
                a(cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 1 })", href := "https://stackoverflow.com/company/about", "About")
              ), " ", 
              li(cls := "-item", 
                a(cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 27 })", href := "https://stackoverflow.com/company/press", "Press")
              ), " ", 
              li(cls := "-item", 
                a(cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 9 })", href := "https://stackoverflow.com/company/work-here", "Work Here")
              ), " ", 
              li(cls := "-item", 
                a(cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 7 })", href := "https://stackoverflow.com/legal", "Legal")
              ), " ", 
              li(cls := "-item", 
                a(cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 8 })", href := "https://stackoverflow.com/legal/privacy-policy", "Privacy Policy")
              ), " ", 
              li(cls := "-item", 
                a(cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link: 13 })", href := "https://stackoverflow.com/company/contact", "Contact Us")
              ), " "
            ), " "
          ), " ", 
          div(cls := "site-footer--col site-footer--categories-nav site-footer--col__visible", " ", 
            a(href := "#", cls := "site-footer--back js-footer-back", 
              tag("svg")(aria.hidden := "true", cls := "svg-icon iconArrowLeftAlt", attr("width") := "18", attr("height") := "18", attr("viewBox") := "0 0 18 18", 
                tag("path")(attr("d") := "M10.58 16L12 14.59 6.4 9 12 3.41 10.57 2l-7 7z")
              )
            ), " ", 
            div(" ", 
              h5(cls := "-title", 
                a(href := "https://stackexchange.com", "Stack Exchange", " Network", 
                  br()
                )
              ), " ", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "#", cls := "-link _expandable js-footer-category-trigger js-gps-track", data("gps-track") := "footer.click({ location: 1, link: 24 })", data("target") := "Technology", "Technology")
                ), " ", 
                li(cls := "-item", 
                  a(href := "#", cls := "-link _expandable js-footer-category-trigger js-gps-track", data("gps-track") := "footer.click({ location: 1, link: 24 })", data("target") := "Life / Arts", "Life / Arts")
                ), " ", 
                li(cls := "-item", 
                  a(href := "#", cls := "-link _expandable js-footer-category-trigger js-gps-track", data("gps-track") := "footer.click({ location: 1, link: 24 })", data("target") := "Culture / Recreation", 
                    "Culture / Recreation"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "#", cls := "-link _expandable js-footer-category-trigger js-gps-track", data("gps-track") := "footer.click({ location: 1, link: 24 })", data("target") := "Science", "Science")
                ), " ", 
                li(cls := "-item", 
                  a(href := "#", cls := "-link _expandable js-footer-category-trigger js-gps-track", data("gps-track") := "footer.click({ location: 1, link: 24 })", data("target") := "Other", "Other")
                ), " "
              ), " "
            ), " "
          ), " ", 
          div(cls := "site-footer--categories", " ", 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Technology", " ", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://stackoverflow.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "professional and enthusiast programmers", "Stack Overflow")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://serverfault.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "system and network administrators", "Server Fault")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://superuser.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "computer enthusiasts and power users", "Super User")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://webapps.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "power users of web applications", "Web Applications")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://askubuntu.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "Ubuntu users and developers", "Ask Ubuntu")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://webmasters.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "pro webmasters", "Webmasters")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://gamedev.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "professional and independent game developers", "Game Development")
                ), " "
              )
            ), 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Technology", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://tex.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "users of TeX, LaTeX, ConTeXt, and related typesetting systems", "TeX - LaTeX")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://softwareengineering.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "professionals, academics, and students working within the systems development life cycle", 
                    "Software Engineering"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://unix.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "users of Linux, FreeBSD and other Un*x-like operating systems", "Unix & Linux")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://apple.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "power users of Apple hardware and software", 
                    "Ask Different (Apple)"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://wordpress.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "WordPress developers and administrators", 
                    "WordPress Development"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://gis.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "cartographers, geographers and GIS professionals", 
                    "Geographic Information Systems"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://electronics.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "electronics and electrical engineering professionals, students, and enthusiasts", 
                    "Electrical Engineering"
                  )
                ), " "
              )
            ), 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Technology", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://android.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "enthusiasts and power users of the Android operating system", "Android Enthusiasts")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://security.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "information security professionals", 
                    "Information Security"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://dba.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "database professionals who wish to improve their database skills and learn from others in the community", 
                    "Database Administrators"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://drupal.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "Drupal developers and administrators", "Drupal Answers")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://sharepoint.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "SharePoint enthusiasts", "SharePoint")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://ux.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "user experience researchers and experts", "User Experience")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://mathematica.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "users of Wolfram Mathematica", "Mathematica")
                ), " "
              )
            ), 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Technology", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://salesforce.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "Salesforce administrators, implementation experts, developers and anybody in-between", "Salesforce")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://expressionengine.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "administrators, end users, developers and designers for ExpressionEngine® CMS", 
                    "ExpressionEngine® Answers"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://pt.stackoverflow.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "programadores profissionais e entusiastas", 
                    "Stack Overflow em Português"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://blender.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "people who use Blender to create 3D graphics, animations, or games", "Blender")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://networkengineering.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "network engineers", "Network Engineering")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://crypto.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "software developers, mathematicians and others interested in cryptography", "Cryptography")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://codereview.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "peer programmer code reviews", "Code Review")
                ), " "
              )
            ), 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Technology", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://magento.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "users of the Magento e-Commerce platform", "Magento")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://softwarerecs.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "people seeking specific software recommendations", 
                    "Software Recommendations"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://dsp.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "practitioners of the art and science of signal, image and video processing", "Signal Processing")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://emacs.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "those using, extending or developing Emacs", "Emacs")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://raspberrypi.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "users and developers of hardware and software for Raspberry Pi", "Raspberry Pi")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://ru.stackoverflow.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "программистов", 
                    "Stack Overflow на русском"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://codegolf.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "programming puzzle enthusiasts and code golfers", 
                    "Programming Puzzles & Code Golf"
                  )
                ), " "
              )
            ), 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Technology", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://es.stackoverflow.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "programadores y profesionales de la informática", 
                    "Stack Overflow en español"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://ethereum.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "users of Ethereum, the decentralized application platform and smart contract enabled blockchain", "Ethereum")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://datascience.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "Data science professionals, Machine Learning specialists, and those interested in learning more about the field", "Data Science")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://arduino.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "developers of open-source hardware and software that is compatible with Arduino", "Arduino")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://bitcoin.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "Bitcoin crypto-currency enthusiasts", "Bitcoin")
                ), " ", 
                li(cls := "-item", " ", 
                  a(href := "https://stackexchange.com/sites#technology", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 26 })", " ", 
                    strong(" more (30) "), " "
                  ), " "
                ), " "
              ), " "
            ), " ", 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Life / Arts", " ", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://photo.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "professional, enthusiast and amateur photographers", "Photography")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://scifi.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "science fiction and fantasy enthusiasts", 
                    "Science Fiction & Fantasy"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://graphicdesign.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "Graphic Design professionals, students, and enthusiasts", "Graphic Design")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://movies.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "movie and tv enthusiasts", "Movies & TV")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://music.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "musicians, students, and enthusiasts", 
                    "Music: Practice & Theory"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://worldbuilding.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "writers/artists using science, geography and culture to construct imaginary worlds and settings", "Worldbuilding")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://cooking.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "professional and amateur chefs", 
                    "Seasoned Advice (cooking)"
                  )
                ), " "
              )
            ), 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Life / Arts", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://diy.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "contractors and serious DIYers", "Home Improvement")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://money.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "people who want to be financially literate", 
                    "Personal Finance & Money"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://academia.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "academics and those enrolled in higher education", "Academia")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://law.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "legal professionals, students, and others with experience or interest in law", "Law")
                ), " ", 
                li(cls := "-item", " ", 
                  a(href := "https://stackexchange.com/sites#lifearts", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 26 })", " ", 
                    strong(" more (15) "), " "
                  ), " "
                ), " "
              ), " "
            ), " ", 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Culture / Recreation", " ", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://english.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "linguists, etymologists, and serious English language enthusiasts", 
                    "English Language & Usage"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://skeptics.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "scientific skepticism", "Skeptics")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://judaism.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "those who base their lives on Jewish law and tradition and anyone interested in learning more", "Mi Yodeya (Judaism)")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://travel.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "road warriors and seasoned travelers", "Travel")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://christianity.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "committed Christians, experts in Christianity and those interested in learning more", "Christianity")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://ell.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "speakers of other languages learning English", 
                    "English Language Learners"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://japanese.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "students, teachers, and linguists wanting to discuss the finer points of the Japanese language", "Japanese Language")
                ), " "
              )
            ), 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Culture / Recreation", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://gaming.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "passionate videogamers on all platforms", "Arqade (gaming)")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://bicycles.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "people who build and repair bicycles, people who train cycling, or commute on bicycles", "Bicycles")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://rpg.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "gamemasters and players of tabletop, paper-and-pencil role-playing games", "Role-playing Games")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://anime.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "anime and manga fans", "Anime & Manga")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://puzzling.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "those who create, solve, and study puzzles", "Puzzling")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://mechanics.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "mechanics and DIY enthusiast owners of cars, trucks, and motorcycles", 
                    "Motor Vehicle Maintenance & Repair"
                  )
                ), " ", 
                li(cls := "-item", " ", 
                  a(href := "https://stackexchange.com/sites#culturerecreation", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 26 })", " ", 
                    strong(" more (33) "), " "
                  ), " "
                ), " "
              ), " "
            ), " ", 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Science", " ", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://mathoverflow.net", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "professional mathematicians", "MathOverflow")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://math.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "people studying math at any level and professionals in related fields", "Mathematics")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://stats.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "people interested in statistics, machine learning, data analysis, data mining, and data visualization", 
                    "Cross Validated (stats)"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://cstheory.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "theoretical computer scientists and researchers in related fields", 
                    "Theoretical Computer Science"
                  )
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://physics.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "active researchers, academics and students of physics", "Physics")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://chemistry.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "scientists, academics, teachers, and students in the field of chemistry", "Chemistry")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://biology.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "biology researchers, academics, and students", "Biology")
                ), " "
              )
            ), 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Science", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://cs.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "students, researchers and practitioners of computer science", "Computer Science")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://philosophy.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "those interested in the study of the fundamental nature of knowledge, reality, and existence", "Philosophy")
                ), " ", 
                li(cls := "-item", " ", 
                  a(href := "https://stackexchange.com/sites#science", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 26 })", " ", 
                    strong(" more (10) "), " "
                  ), " "
                ), " "
              ), " "
            ), " ", 
            div(cls := "site-footer--col site-footer--category js-footer-col", data("name") := "Other", " ", 
              ul(cls := "-list", " ", 
                li(cls := "-item", 
                  a(href := "https://meta.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "meta-discussion of the Stack Exchange family of Q&A websites", "Meta Stack Exchange")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://stackapps.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "apps, scripts, and development with the Stack Exchange API", "Stack Apps")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://api.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "programmatic interaction with Stack Exchange sites", "API")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://data.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "querying Stack Exchange data using SQL", "Data")
                ), " ", 
                li(cls := "-item", 
                  a(href := "https://area51.stackexchange.com", cls := "-link js-gps-track", data("gps-track") := "footer.click({ location: 2, link: 25 })", title := "proposing new sites in the Stack Exchange network", "Area 51")
                ), " "
              ), " "
            ), " "
          ), " "
        ), " ", 
        div(cls := "site-footer--copyright fs-fine", " ", 
          ul(cls := "-list", " ", 
            li(cls := "-item", 
              a(cls := "js-gps-track -link", data("gps-track") := "footer.click({ location: 1, link:4 })", href := "https://stackoverflow.blog?blb=1", "Blog")
            ), " ", 
            li(cls := "-item", 
              a(href := "https://www.facebook.com/officialstackoverflow/", cls := "-link", "Facebook")
            ), " ", 
            li(cls := "-item", 
              a(href := "https://twitter.com/stackoverflow", cls := "-link", "Twitter")
            ), " ", 
            li(cls := "-item", 
              a(href := "https://linkedin.com/company/stack-overflow", cls := "-link", "LinkedIn")
            ), " "
          ), " ", 
          p(cls := "mt-auto mb24", 
            " site design / logo © 2018 Stack Exchange Inc; user contributions licensed under ", 
            a(href := "https://creativecommons.org/licenses/by-sa/3.0/", rel := "license", "cc by-sa 3.0"), " with ", 
            a(href := "https://stackoverflow.blog/2009/06/25/attribution-required/", rel := "license", 
              "attribution required"
            ), ". ", 
            span(id := "svnrev", "rev 2018.10.2.31795"), " "
          ), " "
        ), " "
      ), " "
    ), " ", 
    script(
      raw("StackExchange.ready(function () { StackExchange.responsiveness.addSwitcher(); })")
    ), " ", 
    tag("noscript")(" ", 
      div(id := "noscript-warning", 
        "Stack Overflow works best with JavaScript enabled "
      ), " "
    ), " ", 
    script(
      raw(""" (function(i, s, o, g, r, a, m) {
        i['GoogleAnalyticsObject'] = r; i[r] = i[r] || function() { (i[r].q = i[r].q || []).push(arguments) }, i[r].l = 1 * new Date(); a = s.createElement(o),
            m = s.getElementsByTagName(o)[0]; a.async = 1; a.src = g; m.parentNode.insertBefore(a, m);
    })(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');

    StackExchange.ready(function () {

        StackExchange.ga.init({
            sendTitles: true,
            tracker: window.ga,
            trackingCodes: [
                'UA-108242619-1'
            ]
        });

        StackExchange.ga.setDimension('dimension1', '1554291');

        StackExchange.ga.setDimension('dimension10', 'ActivelyLooking');


        StackExchange.ga.setDimension('dimension3', 'Home/Index');


        StackExchange.ga.trackPageView();
    });

    /**/

    var _qevents = _qevents || [],
        _comscore = _comscore || [];
    (function() {
        var ssl = 'https:' == document.location.protocol,
            s = document.getElementsByTagName('script')[0],
            qc = document.createElement('script');
        qc.async = true;
        qc.src = (ssl ? 'https://secure' : 'http://edge') + '.quantserve.com/quant.js';
        s.parentNode.insertBefore(qc, s);
        _qevents.push({ qacct: "p-c1rF4kxgLUzNc" });
        /**/
        var sc = document.createElement('script');
        sc.async = true;
        sc.src = (ssl ? 'https://sb' : 'http://b') + '.scorecardresearch.com/beacon.js';
        s.parentNode.insertBefore(sc, s);
        _comscore.push({ c1: "2", c2: "17440561" });
    })(); """)
    ), " "
  )
)