package com.bright.listofmessages.constant

import com.bright.listofmessages.model.Message

object MessageConstant {

    fun messageListData(): List<Message>{
       return listOf(
            Message("BS in Computer Science", "Today’s society is increasingly information-based. Fundamental knowledge of how computers and computing systems work is a vital part of modern life and a universal skill that can be applied to a variety of careers and fields.\n" +
                    "\n" +
                    "Our computer science program will prepare you for success by providing comprehensive knowledge of the discipline and by teaching you how to think clearly, precisely, and creatively."),
            Message("BA in Consciousness & Human Potential", "The BA in Consciousness & Human Potential integrates personal experience, philosophy of mind, neuroscience, and ancient wisdom.\n" +
                    "\n" +
                    "Our goal for every student is enlightenment — the systematic development of full potential from within. This is the key to true fulfillment in daily life and any career."),

            Message("BA in Art, Consciousness, & Creative Practice","In our block system you’ll study one full-time course per month, giving you the time you need to dive deeply into each subject. You’ll be immersed in each studio class without the stress of juggling multiple courses and assignments."),
            Message("MA in Consciousness & Human Potential", "In this program, you’ll join the ranks of great thinkers to further humanity’s ever-evolving understanding of consciousness and human potential, and dive into a field of study that offers profound opportunities for self-discovery, transformation, and contributing to the greater good"),
            Message("PhD in Maharishi Vedic Science", "Maharishi Vedic Science is the study of the unbounded, infinite field of consciousness lying at the basis of phenomenal existence and located within everyone as their own innermost Self."),
            Message("MA in Studio Art", "In our unique MA in Art, you’ll enjoy an intensive, two-semester exploration into studio practice while cultivating a deep connection to yourself through the Transcendental Meditation technique"),
            Message("BA in Ayurveda Wellness & Integrative Health", "We teach the Maharishi AyurVedaSM health system – the modern, scientific revival of complete Ayurveda. Maharishi AyurVeda includes balancing the deepest value of mind – consciousness, which is the basis of balancing the body. It incorporates all aspects of mind, body, behavior, and environment in a scientific framework."),
            Message("Bachelor’s Specialization in Life & Wellness Coaching", "We’ll teach you to identify a client’s unique mind-body constitution and apply techniques that are compassionate, motivating, and specific to each person to promote change."),
            Message("MS in Maharishi AyurVeda & Integrative Medicine", "vata, pitta, and kapha doshas"),
            Message("BA in Business Administration", "Consciousness-based business courses at MIU provide the education you need to help transform society through sustainable and socially responsible business. Taking business courses can be beneficial to the career of any student in any major."),
            Message("BA in Sustainable & Regenerative Living", "Design, build, and live in a way that replenishes the health of people, communities, and our planet"),
            Message("Become a leader in conflict resolution", "Learn to communicate with maximum effectiveness and lead an organization through interpersonal challenges towards a harmonious and conflict-free work environment")
        )
    }
}